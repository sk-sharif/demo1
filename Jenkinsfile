// @Library('first-shared-lib') _
pipeline {
  agent any 
  
  stages {
    stage('mabl test') {
      steps {
        script {
          withCredentials([usernamePassword(credentialsId: 'mablid', passwordVariable: 'mablenvid', usernameVariable: 'mablappid')]) {
            mabl apiBaseUrl: 'https://api.mabl.com', appBaseUrl: 'https://app.mabl.com', applicationId: "${mablappid}", continueOnMablError: true, continueOnPlanFailure: true, environmentId: "${mablenvid}", labels: '', mablBranch: '', restApiKeyId: 'mabl-rest-api'
          }
        }
      }
    }  
  }
}
