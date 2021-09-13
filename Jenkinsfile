def branch = "${env.BRANCH_NAME}"
// import groovy.json.JsonSlurper;
@Library('first-shared-lib') _

pipeline {
  agent any
  
  stages {
    stage('checking restapi') {
      steps {
        script {
          def flag = 0
          
          arr = restapi.listsOfMachine()
          echo '1'
          echo "${arr}";
          echo "${arr.size()}";
          echo '2'
//           def parser = new JsonSlurper()
//           def json = parser.parseText(arr)
//           echo "${json[0].Name}"
//           echo "${json.size()}"
          for(i=0;i<arr.size();i++) {
            if(arr[i].Name == "${branch}") {
              flag = 1
            }
          }
          
          if(flag==1) {
            echo "machine alradey exist update the machine"
            restapi.updateMachine(branch_name: "${branch}");
            sleep 5;
          } else {
            echo "create the machine"
          }
          
        }
      }
    }
  }
}
