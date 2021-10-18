// // def branch = "${env.BRANCH_NAME}"
// // @Library('first-shared-lib') _
// pipeline {
//   agent any
//   stages {
//     stage('invoking the orchestration api') {
//       steps {
//         script {
// //           shared.invokingApi(branch: "${branch}")
// //           echo "stage 1"
// //           def isStartedByUser = currentBuild.rawBuild.getCause(hudson.model.Cause$UserIdCause) != null
//           echo "$BUILD_USER"
//           echo "$BUILD_NUMBER"
// //           echo "${currentBuild.buildCauses}" // same as currentBuild.getBuildCauses()
// //           echo "${currentBuild.getBuildCauses('hudson.model.Cause$UserCause')}"
// //           echo "${currentBuild.getBuildCauses('hudson.triggers.TimerTrigger$TimerTriggerCause')}"
//         }
//       }
//     }
// //     stage('Triggring integration test') {
// //       steps {
// //         script {
// // //           shared.integrationTest(branch: "${branch}")
// //           echo "stage 2"
// //         }
// //       }
// //     } 
//   }
// //   post {
// //     success {
// //       script {
// //         db.logging(branch_name: "${branch}",action: "Environment ${branch} was provisioned")
// //       }
// //     }
// //     failure {
// //       script {
// //         db.logging(branch_name: "${branch}",action: "Environment ${branch} failed to provisioned")
// //       }
// //     }
// //   }
// }


// node {
//   wrap([$class: 'BuildUser']) {
//     echo "${env.BUILD_USER}"
//     echo "${env.BUILD_USER_ID}"
//     echo "${env.BUILD_USER_EMAIL}"
//     echo "${env.BUILD_USER_GROUPS}"
//   }
// }

pipeline {
    agent any
    options {
        timestamps()
    }
    stages {
        stage('Test Stage') {
            steps {
                script {
                    echo "${env.BUILD_URL}"
                }
            }
        }
    }
}


