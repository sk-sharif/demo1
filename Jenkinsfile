#!/usr/bin/env groovy
def customImages
pipeline {
  agent any
  environment {
    registry = "akanshagiriya/angular"
    registryCredential = 'Docker_cred'
  }
  
  stages {
    
    stage('Build Dockerfile'){
     steps {
        script {
          docker.withRegistry( '', registryCredential ) {
            def dockerfile = 'Dockerfile'
            customImages = docker.build("${registry}:${BUILD_NUMBER}", "-f ./${dockerfile} ./")
//             customImages.push()
          }
        }
      }
    }
    
    stage('Tag') {
//       when {
// // 	branch 'main'
//  	expression { sh([returnStdout: true, script: 'echo $TAG_NAME | tr -d \'\n\'']) || env.BRANCH == 'main' }
// // 	buildingTag()
        
//       }
      steps {
        script {
          TAG = sh(returnStdout: true, script: 'git tag --points-at HEAD')
          echo "${TAG}"
          echo "${env.BRANCH_NAME}"
          if(TAG && env.BRANCH_NAME == 'main') {
            echo 'if condition'
          }
          else {
            echo 'not if'
          }
        }
      }
    }
  }
}
