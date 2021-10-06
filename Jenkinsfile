// @Library('first-shared-lib') _
def branch = "youtube"
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
          
          var = sh(script: """mabl environments list | awk '''{print \$4}' """, returnStdout: true).trim()
          echo "checked"
          echo var
          lines = var.split( '\n' )
//           lines = lines.replaceAll(~/\n/, "#")
          echo "checked1"
          echo lines[0]

//           for(i=0;i<var.size();i++) {
          
//           }
        }
      }
    }  
  }
}
