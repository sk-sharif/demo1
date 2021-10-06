// @Library('first-shared-lib') _
pipeline {
  agent any 
  
  stages {
    stage('mabl test') {
      steps {
        script {
          mabl apiBaseUrl: 'https://api.mabl.com', appBaseUrl: 'https://app.mabl.com', applicationId: 'RL3pjypTsSB6dmRCKcHOwA-a', environmentId: 'NYU503tojgNv1E89EEsBzw-e', labels: 'mabl-jenkins', mablBranch: '', restApiKeyId: 'mabl-rest-api'
        }
      }
    }  
  }
}
