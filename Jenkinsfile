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
   registry = "akanshagiriya/demmo"
    registryCredential = 'Docker_cred'
   HOME = 'hi'
 }
  
  stages {
    stage('Building a image for amazon-associate-etl ') {
      steps {
        script {
          docker.withRegistry('', registryCredential) {
            def dockerfile = 'Dockerfile'
//             def customImage = docker.build("${registry}:${BUILD_NUMBER}","-f ./${dockerfile} .")
//             sh 'def customImage = docker build -t ${registry}:latest --build-arg ${HOME} .'
            docker.build registry --build-args HOME
//             customImage.push()
          }
        }

      }
      
    }
  }
}
