// @Library('first-shared-lib') _
def branchs = "youtube"
def flag = 0

def branch = "${env.BRANCH_NAME}"
pipeline {
  agent any 
  
  stages {
    stage('mabl test') {
      steps {
        script {
          def var = sh(script: """mabl environments list | awk '''{print \$4}' """, returnStdout: true).trim()
          def lines = var.split( '\n' ).findAll { !it.startsWith( ',' ) }
          def count = 0
          def values = []
          for(i=0;i<lines.size();i++) {
            if(lines[i] != '') {
              values << lines[i]
              count++
            }
          }
          
          echo "${values}"
          
          for(i=0;i<values.size();i++) { 
            if(values[i] == "${branch}") {
              flag = 1
            }
          }
          
          if(flag == 1) {
            echo "env already exist test the app url"
            def envId = sh(script: """mabl environments list | grep "${branch}" | awk '''{print \$2}' """, returnStdout: true).trim()
            echo "${envId}"
            if("${envId}" == '')
            {
              mabl apiBaseUrl: 'https://api.mabl.com', appBaseUrl: 'https://app.mabl.com', applicationId: "XOJFKAPszBS7Kx0yKZ5P4Q-a", environmentId: "${envId}", labels: '', mablBranch: '', restApiKeyId: 'mabl-rest-api'
            } else {
              echo "env is not null"
            }
          } else {
            echo "create the env and test the  url"
            sh "mabl auth activate-key zbPJbQX32ZUrlLinkZyUBQ"
            sh "mabl environments create --name ${branch} --application-id XOJFKAPszBS7Kx0yKZ5P4Q-a --app-url https://www.youtube.com/ --link link-agent --preview true"
            def envId = sh(script: """mabl environments list | grep "${branch}" | awk '''{print \$2}' """, returnStdout: true).trim()
            echo "${envId}"
            if("${envId}" != '')
            {
              mabl apiBaseUrl: 'https://api.mabl.com', appBaseUrl: 'https://app.mabl.com', applicationId: "XOJFKAPszBS7Kx0yKZ5P4Q-a", environmentId: "${envId}", labels: '', mablBranch: '', restApiKeyId: 'mabl-rest-api'
            }
          }
         
        }
      }
    }  
  }
}
