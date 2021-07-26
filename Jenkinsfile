#!/usr/bin/env groovy
def customImages
pipeline {
  agent any
  environment {
    registry = "akanshagiriya/angular"
    registryCredential = 'Docker_cred'
  }
  
  stages {
    stage('hello') {
      steps {
        script {
          script()
        }
      }
    }
//     stage('Build Dockerfile'){
//      steps {
//         script {
//           docker.withRegistry( '', registryCredential ) {
//             def dockerfile = 'Dockerfile'
//             customImages = docker.build("${registry}:${BUILD_NUMBER}", "-f ./${dockerfile} ./")
// //             customImages.push()
//           }
//         }
//       }
//     }
    
//     stage('Tag') {
// //       when {
// // // 	branch 'main'
// //  	expression { sh([returnStdout: true, script: 'echo $TAG_NAME | tr -d \'\n\'']) || env.BRANCH_NAME == 'main' }
// // // 	buildingTag() 
// //       }
//       steps {
//         script {
//           echo 'tag'
//         }
//       }
//     }
  }
}
