// @Library("shared-library") _

// building {
//   name = 'demo1'
// }

// project1 {
//   name = 'project1'
// }
pipeline {
  agent any
 environment{
    registryCredential = 'Docker_cred'
 }
  
  stages {
    stage('Building a image for amazon-associate-etl ') {
      steps {
        script {
          docker.withRegistry('', registryCredential) {
            def dockerfile = 'Dockerfile'
            def customImage = docker.build("${registry}:${BUILD_NUMBER}", "-f .${dockerfile} .")
            customImage.push()
          }
        }

      }
      
    }
  }
}
