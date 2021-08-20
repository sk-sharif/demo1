// @Library('first-shared-lib') _
// project1 {
// }

@Library('first-shared-lib') _
node {
  stage("checking stage 1") {
    checking()
  }
  stage("checking stage 2") {
    checking.calling()
  }
}



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
