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
          env.GIT_COMMIT_MSG = sh (script: 'git log -1 --pretty=%B ${GIT_COMMIT}', returnStdout: true).trim()
          sh 'echo ${GIT_COMMIT}'
        }
      }
    }
    
  }
}
