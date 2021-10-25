// def branch = "${env.BRANCH_NAME}"
@Library('first-shared-lib') _
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
//                     echo "${env.BUILD_URL}/console"
//                     echo "${env.BUILD_NUMBER}"
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


// pipeline {
//     agent any
//     parameters {
//     choice(
//         name: 'myParameter',
//         choices: "main\ndev\nprod",
//         description: 'interesting stuff' )
//     }
//     stages {
//         stage('Test') {
//             steps {
//                 script {
//                     echo "${params.myParameter}"
//                 }
//             }
//         }
//     }
// }

properties([
    parameters([
        [$class: 'ChoiceParameter', 
            choiceType: 'PT_SINGLE_SELECT', 
            description: 'Select the Env Name from the Dropdown List', 
            filterLength: 1, 
            filterable: true, 
            name: 'Env', 
            randomName: 'choice-parameter-5631314439613978', 
            script: [
                $class: 'GroovyScript', 
                fallbackScript: [
                    classpath: [], 
                    sandbox: false, 
                    script: 
                        'return[\'Could not get Env\']'
                ], 
                script: [
                    classpath: [], 
                    sandbox: false, 
                    script: 
                        'return["Dev","QA","Stage","Prod"]'
                ]
            ]
        ], 
        [$class: 'CascadeChoiceParameter', 
            choiceType: 'PT_SINGLE_SELECT', 
            description: 'Select the Server from the Dropdown List', 
            filterLength: 1, 
            filterable: true, 
            name: 'Server', 
            randomName: 'choice-parameter-5631314456178619', 
            referencedParameters: 'Env', 
            script: [
                $class: 'GroovyScript', 
                fallbackScript: [
                    classpath: [], 
                    sandbox: false, 
                    script: 
                        'return[\'Could not get Environment from Env Param\']'
                ], 
                script: [
                    classpath: [], 
                    sandbox: false, 
                    script: 
                        ''' if (Env.equals("Dev")){
                                return["devaaa001","devaaa002","devbbb001","devbbb002","devccc001","devccc002"]
                            }
                            else if(Env.equals("QA")){
                                return["qaaaa001","qabbb002","qaccc003"]
                            }
                            else if(Env.equals("Stage")){
                                return["staaa001","stbbb002","stccc003"]
                            }
                            else if(Env.equals("Prod")){
                                return["praaa001","prbbb002","prccc003"]
                            }
                        '''
                ]
            ]
        ]
    ])
])

pipeline {
  environment {
         vari = ""
  }
  agent any
  stages {
      stage ("Example") {
        steps {
         script{
          echo 'Hello'
          echo "${params.Env}"
          echo "${params.Server}"
          if (params.Server.equals("Could not get Environment from Env Param")) {
              echo "Must be the first build after Pipeline deployment.  Aborting the build"
              currentBuild.result = 'ABORTED'
              return
          }
          echo "Crossed param validation"
        } }
      }
  }
}
