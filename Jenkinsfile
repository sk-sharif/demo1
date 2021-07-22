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
          sh 'echo sh(returnStdout: true, script: 'git tag -l --points-at HEAD').trim()'
          docker.withRegistry( '', registryCredential ) {
//             def dockerfile = 'Dockerfile'
//             def customImages = docker.build("${registry}:v4.0", "-f ./${dockerfile} ./")
            customImages.push()
          }
        }
      }
    }
  }
}
