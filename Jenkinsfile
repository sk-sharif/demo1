// @Library('first-shared-lib') _
def branchs = "youtube"
def branch = "${env.BRANCH_NAME}"
pipeline {
  agent any 
  
  stages {
    stage('mabl test') {
      steps {
        script {
//           mabl apiBaseUrl: 'https://api.mabl.com', appBaseUrl: 'https://app.mabl.com', applicationId: 'IWg7TNlUCipRxQwa1AmHQQ-a', environmentId: 'NYU503tojgNv1E89EEsBzw-e', labels: '', mablBranch: '', restApiKeyId: 'mabl-rest-api'
//           sh "mabl auth activate-key zbPJbQX32ZUrlLinkZyUBQ"
//           sh "mabl environments create --name E0-link-agent-3 --application-id XOJFKAPszBS7Kx0yKZ5P4Q-a --app-url https://www.youtube.com/ --link link-agent --preview true"
          mabl apiBaseUrl: 'https://api.mabl.com', appBaseUrl: 'https://app.mabl.com', applicationId: 'XOJFKAPszBS7Kx0yKZ5P4Q-a', environmentId: 'WjNpYCKxLpUNTonRgRRSKA-e', labels: '', mablBranch: '', restApiKeyId: 'mabl-rest-api'

//           def var = sh(script: """mabl environments list | awk '''{print \$4}' """, returnStdout: true).trim()
//           echo "checked"
//           def lines = var.split( '\n' ).findAll { !it.startsWith( ',' ) }
//           def count = 0
//           def values = []
//           for(i=0;i<lines.size();i++) {
//             if(lines[i] != '') {
//               values << lines[i]
//               count++
//             }
//           }
          
//           for(i=0;i<values.size();i++) {
//             if(values[i] == "${branch}") {
//               // check the env is there in mabl if is there run the test using line 14
//               def envId = sh(script: """mabl environments list | grep "${branch}" | awk '''{print \$2}' """, returnStdout: true).trim()
//               mabl apiBaseUrl: 'https://api.mabl.com', appBaseUrl: 'https://app.mabl.com', applicationId: "XOJFKAPszBS7Kx0yKZ5P4Q-a", labels: '', mablBranch: '', restApiKeyId: 'mabl-rest-api'
//             } else {
//               // create the env using 13 line and run the test using  line 14
//             }
//           }
          
        }
      }
    }  
  }
}
