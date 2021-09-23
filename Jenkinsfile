pipeline {
  agent any 
  
  stages {
    stage('mabl test') {
      steps {
        script {
          mabl apiBaseUrl: 'https://api.mabl.com', appBaseUrl: 'https://app.mabl.com', environmentId: 'EupLyMr0dXRBu7mHF84QEw-e', labels: '', mablBranch: '', restApiKeyId: 'mabl-rest-api'
        }
      }
    }
  }
}
