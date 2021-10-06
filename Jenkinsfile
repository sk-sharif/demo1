// @Library('first-shared-lib') _
// def var;
pipeline {
  agent any 
  
  stages {
    stage('mabl test') {
      steps {
        script {
//           mabl apiBaseUrl: 'https://api.mabl.com', appBaseUrl: 'https://app.mabl.com', applicationId: 'IWg7TNlUCipRxQwa1AmHQQ-a', environmentId: 'NYU503tojgNv1E89EEsBzw-e', labels: '', mablBranch: '', restApiKeyId: 'mabl-rest-api'
//           sh "mabl auth activate-key zbPJbQX32ZUrlLinkZyUBQ"
//           sh "mabl environments create --name E0-link-agent-3 --application-id XOJFKAPszBS7Kx0yKZ5P4Q-a --app-url https://www.youtube.com/ --link link-agent --preview true"
//           mabl apiBaseUrl: 'https://api.mabl.com', appBaseUrl: 'https://app.mabl.com', applicationId: 'XOJFKAPszBS7Kx0yKZ5P4Q-a', labels: '', mablBranch: '', restApiKeyId: 'mabl-rest-api'
//           sh "mabl applications list"
          
          def var = sh(script: """mabl environments list | grep youtube | awk '''{print \$2}' """ )
          echo var
        }
      }
    }  
  }
}
