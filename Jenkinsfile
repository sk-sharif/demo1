// @Library('first-shared-lib') _
// building 'Sagar'
// building 'Sharif'

pipeline {
  agent any 
  
  stages {
    stage('checking branch') {
      when {
        expression{env.BRANCH_NAME == 'main' && 'test'}
      }
      
      steps {
        script {
          echo "${BRANCH_NAME}"
        }
      }
    }
  }
  
}
