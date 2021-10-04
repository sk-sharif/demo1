// @Library('first-shared-lib') _
pipeline {
  agent any 
  
  stages {
    stage('mabl test') {
      steps {
        script {
          echo "hi"
          echo "${currentBuild.currentResult}"
        }
      }
    }
  }
}
