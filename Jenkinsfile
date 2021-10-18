// def branch = "${env.BRANCH_NAME}"
// @Library('first-shared-lib') _
pipeline {
  agent any
  stages {
    stage('invoking the orchestration api') {
      steps {
        script {
//           shared.invokingApi(branch: "${branch}")
          echo "stage 1"
//           def isStartedByUser = currentBuild.rawBuild.getCause(hudson.model.Cause$UserIdCause) != null
//           echo "${isStartedByUser}"
        }
      }
    }
//     stage('Triggring integration test') {
//       steps {
//         script {
// //           shared.integrationTest(branch: "${branch}")
//           echo "stage 2"
//         }
//       }
//     } 
  }
//   post {
//     success {
//       script {
//         db.logging(branch_name: "${branch}",action: "Environment ${branch} was provisioned")
//       }
//     }
//     failure {
//       script {
//         db.logging(branch_name: "${branch}",action: "Environment ${branch} failed to provisioned")
//       }
//     }
//   }
}
