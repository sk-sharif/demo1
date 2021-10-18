def branch = "${env.BRANCH_NAME}"
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
//     echo "sharif"
//     echo "${env.BUILD_USER}"
//     echo "${env.BUILD_USER_ID}"
//     echo "${env.BUILD_USER_EMAIL}"
//     echo "${env.BUILD_USER_GROUPS}"
//   }
// }

// pipeline {
//     agent any
//     options {
//         timestamps()
//     }
//     stages {
//         stage('Test Stage') {
//             steps {
//                 script {
// //                     echo "${env.BUILD_URL}/console"
// //                     echo "${env.BUILD_NUMBER}"
// //                     BUILD_TRIGGER_BY = "${currentBuild.getBuildCauses()[0].shortDescription} / ${currentBuild.getBuildCauses()[0].userId}"
// //                     echo "BUILD_TRIGGER_BY: ${BUILD_TRIGGER_BY}"
// //                   sh "BUILD_CAUSE_JSON=\$(curl --silent \${BUILD_URL}/api/json | tr "{}" '\n' | grep "Started by")"
// //                   sh "BUILD_USER_ID=\$(echo $BUILD_CAUSE_JSON | tr "," '\n' | grep "userId" | awk -F\" '{print \$4}')"
// //                   sh "BUILD_USER_NAME=\$(echo $BUILD_CAUSE_JSON | tr "," '\n' | grep "userName" | awk -F\" '{print \$4}')"
// //                   echo "${BUILD_USER_NAME}"
//                     wrap([$class: 'BuildUser']) {
//                       echo "sharif"
//                       echo "${env.BUILD_USER}"
//                       echo "${env.BUILD_USER_ID}"
//                       echo "${env.BUILD_USER_EMAIL}"
//                       echo "${env.BUILD_USER_GROUPS}"
//                     }
//                 }
//             }
//         }
//     }
// }

pipeline {
    agent any
    options {
        timestamps()
    }
    stages {
        stage('Test Stage') {
            steps {
//                 checkout changelog: true, poll: false, scm: [$class: 'GitSCM', branches: [[name: "*/${branch}"]], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'github_pass', url: 'https://github.com/sk-sharif/demo1.git']]]
                script {
                     Author_ID=sh(script: "git show -s --pretty=%an", returnStdout: true).trim()
                     Author_Name=sh(script: "git show -s --pretty=%ae", returnStdout: true).trim()
                }
                echo "${Author_ID} and ${Author_Name}"
            }
        }
    }
}



