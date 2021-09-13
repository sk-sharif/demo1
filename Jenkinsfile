def branch = "${env.BRANCH_NAME}"
import groovy.json.JsonSlurper;
@Library('first-shared-lib') _

pipeline {
  agent any
  
  stages {
    stage('checking restapi') {
      steps {
        script {
          def flag = 0
          
          arr = restapi.listsOfMachine()
          
          def parser = new JsonSlurper()
          def json = parser.parseText(arr)
          echo "${json[0].Name}"
          echo "${json.size()}"
          for(i=0;i<json.size();i++) {
            if(json[i].Name == "${branch}") {
              flag = 1
            }
          }
          
          if(flag==1) {
            echo "machine alradey exist update the machine"
            restapi.updateMachine(branch_name: "${branch}");
//             sleep 5;
          } else {
            echo "create the machine"
          }
          
        }
      }
    }
  }
}
