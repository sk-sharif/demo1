def invokingApi(Map config = [:]) {
          def check_count=0
          def flag = 0
          withCredentials([usernamePassword(credentialsId: 'test.imqs.co.za', passwordVariable: 'password', usernameVariable: 'username')]) {
            def authString = "${username}:${password}".getBytes().encodeBase64().toString();
            db.logging(branch_name: "${config.branch}",action: "Listing Environment Machine")
            arr = restapi.listsOfMachine(auth: "${authString}")
            db.logging(branch_name: "${config.branch}",action: "Listed Environment Machine")
            echo "Listing the API's"
            
            for(i=0;i<arr.size();i++) {
              if(arr[i].Name == "${config.branch}") {
                flag = 1
              }
            }

            if(flag == 1) {
              echo "machine already exist update the machine"
              db.logging(branch_name: "${config.branch}",action: "Environment ${config.branch} already exist Updating Machine")
              update_status = restapi.updateMachine(branch_name: "${config.branch}",auth: "${authString}");
              if(update_status == 200) {
                echo "machine updated Successfully"
                db.logging(branch_name: "${config.branch}",action: "Environment ${config.branch} was Updated Successfully")
              } else {
                  db.logging(branch_name: "${config.branch}",action: "Environment ${config.branch} is not Updated")
              }
              sleep 5;
            } else {
              echo "creating the machine"
              db.logging(branch_name: "${config.branch}",action: "Creating Environment ${config.branch}")
              status = restapi.createMachine(branch_name: "${config.branch}",auth: "${authString}");
              if(status == 200) {
                echo "Machine is Created Successfully"
                db.logging(branch_name: "${config.branch}",action: "Environment ${config.branch} was Created Successfully")
                
                db.logging(branch_name: "${config.branch}",action: "Environment ${config.branch} Starting Machine")
                for(check_count=0; check_count>=0; check_count++) {
                  status_code = restapi.startMachine(branch_name: "${config.branch}",auth: "${authString}");
                  
                  if(status_code == 200) {
                    echo "Machine Started Successfully"
                    db.logging(branch_name: "${config.branch}",action: "Environment ${config.branch} was Started Successfully")
                    return 0;
                  }
                  echo "${check_count}"
                  if(check_count>=3) {
                    print("Giving up, machine taking too long time to create. Contact SysOps");
                    db.logging(branch_name: "${config.branch}",action: "Environment ${config.branch} was Not Started Contact SysOps")
                    return 0;
                  }
                  sleep(60);
                }
              } else {
                  db.logging(branch_name: "${config.branch}",action: "Environment ${config.branch} was not Created")
              }
            }
          }

}

def integrationTest(Map config = [:]) {
  withCredentials([string(credentialsId: 'mablCLI', variable: 'mablApiKey')]) {
            sh "mabl auth activate-key ${mablApiKey}"
            def var = sh(script: """mabl environments list | awk '''{print \$4}' """, returnStdout: true).trim()
            def lines = var.split( '\n' ).findAll { !it.startsWith( ',' ) }
            def flag = 0
            def values = []
            for(i=0;i<lines.size();i++) {
              if(lines[i] != '') {
                values << lines[i]
              }
            }
            echo "${values}"
            for(i=0;i<values.size();i++) { 
              if(values[i] == "${config.branch}") {
                flag = 1
              }
            }
            withCredentials([usernamePassword(credentialsId: 'mablid', passwordVariable: 'envid', usernameVariable: 'appid')]) {
              if(flag == 1) {
                echo "env already exist test the app url"
                def envId = sh(script: """mabl environments list | grep "${config.branch}" | awk '''{print \$2}' """, returnStdout: true).trim()
                echo "${envId}"
                if("${envId}" != '')
                {
                  db.logging(branch_name: "${config.branch}",action: "Environment ${config.branch} already exist, Trigger the Test")
                  mabl apiBaseUrl: 'https://api.mabl.com', appBaseUrl: 'https://app.mabl.com', applicationId: "${appid}", environmentId: "${envid}", labels: '', mablBranch: '', restApiKeyId: 'mabl-rest-api'
                }
              } else {
                echo "create the env and test the  url"
                db.logging(branch_name: "${config.branch}",action: "Creating Environment ${config.branch} in MABL")
                sh "mabl environments create --name ${config.branch} --application-id ${appid} --app-url https://auth.freshbooks.com/service/auth/integrations/sign_in/ --link link-agent --preview true"
                def envId = sh(script: """mabl environments list | grep "${config.branch}" | awk '''{print \$2}' """, returnStdout: true).trim()
                db.logging(branch_name: "${config.branch}",action: "Environment ${config.branch} is Created in MABL")
                echo "${envId}"
                if("${envId}" != '')
                {
                  db.logging(branch_name: "${config.branch}",action: "Environment ${config.branch} Test is Triggered")
                  mabl apiBaseUrl: 'https://api.mabl.com', appBaseUrl: 'https://app.mabl.com', applicationId: "${appid}", environmentId: "${envid}", labels: '', mablBranch: '', restApiKeyId: 'mabl-rest-api'
                }
              }
            }
          }
}
