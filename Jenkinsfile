// @Library('first-shared-lib') _
pipeline {
  agent any 
  
  stages {
    stage('mabl test') {
      steps {
        script {
//           mabl apiBaseUrl: 'https://api.mabl.com', appBaseUrl: 'https://app.mabl.com', applicationId: 'IWg7TNlUCipRxQwa1AmHQQ-a', environmentId: 'NYU503tojgNv1E89EEsBzw-e', labels: '', mablBranch: '', restApiKeyId: 'mabl-rest-api'
          mabl environments create --name 'E0-link-agent-2' --application-id 'XOJFKAPszBS7Kx0yKZ5P4Q-a' --app-url 'https://www.youtube.com/' --link 'link-agent' --preview true
        }
      }
    }  
  }
}
