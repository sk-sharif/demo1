@Library('first-shared-lib') _

def i=1
pipeline {
  agent any
  
  stages {
    stage('checking restapi') {
      steps {
        script {
          def flag = 0
          def count = 0
          arr = restapi.listsOfMachine()
          echo "${arr}"
          println("class is " + restapi.listOfMachine().getClass())
          
          echo "1"
          echo "${arr.length}"
          for(String target : arr) {           
            echo "hi"
//             echo "${target}"
          }
          if(flag == 0) {
            echo "machine is not there plz create"
          } else {
            echo "machine exists plz update the machine"
          }
          
//           if(i == 1) {
//             echo "hlo"
//           } else {
//             echo "hi"
//           }
//           for(i=0;i<5;i++){
//             echo "${i}"
//           }
        }
      }
    }
  }
}
