// @Library('first-shared-lib') _
pipeline {
  agent any 
  
  stages {
    stage('mabl test') {
      steps {
        script {
          echo "hi"
          sh echo "curl -s -S  -u sharif:9616 ${BUILD_URL}/consoleText"
//           echo "${var}"
        }
      }
    }
  }
}
