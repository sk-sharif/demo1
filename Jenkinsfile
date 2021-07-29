// @Library('first-shared-lib') _
// building 'Sagar'
// building 'Sharif'

pipeline {
  agent any 
  
  stages {
    stage('checking branch') {
      when {
          branch 'env.BRANCH_NAME'
      }
      
      steps {
        script {
          echo "${BRANCH_NAME}"
        }
      }
    }
  }
  
}
