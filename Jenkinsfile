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
// // // 	branch 'main'
//  	expression { sh([returnStdout: true, script: 'echo $TAG_NAME | tr -d \'\n\'']) || env.BRANCH == 'main' }
// // // 	buildingTag() 
//       }
      when {
        allOf {
          branch 'main'
          expression {
            def isTag = sh(returnStdout: true, script: 'echo $TAG_NAME | tr -d \'\n\'')
            return isTag == 0 ? true : false
          }
        }
      }
      steps {
        script {
          echo "tag"
        }
      }
    }
  }
}
