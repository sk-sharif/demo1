pipeline {
  agent any 
  
  stages {
    stage('mabl test') {
      steps {
        script {
//           mabl apiBaseUrl: 'https://api.mabl.com', appBaseUrl: 'https://app.mabl.com', applicationId: 'TWhfwit9seK2SGJrd5A5TA-a', environmentId: 'g8lKfxnI8DqfiJUcq0pYCw-e', labels: '', mablBranch: '', restApiKeyId: 'mabl-rest-api'
          echo "hi"
        }
      }
    }
  }
  post {
    success {
      emailext (
       subject: "SUCCESSFUL: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'",
       body: """<p>SUCCESSFUL: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]':</p>
         <p>Check console output at "<a href="${env.BUILD_URL}">${env.JOB_NAME} [${env.BUILD_NUMBER}]</a>"</p>""",
//         to: '$DEFAULT_RECIPIENTS'
         recipientProviders: [requestor()]
      )
    }
    failure {
      emailext (
       subject: "FAILED: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'",
       body: """<p>FAILED: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]':</p>
         <p>Check console output at "<a href="${env.BUILD_URL}">${env.JOB_NAME} [${env.BUILD_NUMBER}]</a>"</p>""",
       to: '$DEFAULT_RECIPIENTS'
     )
    }
  }  
}
