@Library('first-shared-lib') _
// restapi {
// }

// @Library('first-shared-lib') _
// node {
//   stage("checking stage 1") {
//     checking()
//   }
//   stage("checking stage 2") {
//     checking.calling()
//   }
// }

// @Library('first-shared-lib') _
// node {
//   checking.task()
// //   checking.calling2()
// }


// pipeline {
//   agent any 
  
//   stages {
//     stage('checking branch') {
//       when {
//         expression{env.BRANCH_NAME == 'main' || env.BRANCH_NAME == 'test'}
//       }
      
//       steps {
//         script {
//           echo "${BRANCH_NAME}"
//         }
//       }
//     }
//   }
  
// }
pipeline {
  agent any
  
  stages {
    stage('checking restapi') {
      steps {
        script {
          for(i=0;i<5;i++){
            echo "${i}"
          }
        }
      }
    }
  }
}
