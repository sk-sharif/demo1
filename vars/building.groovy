def call(String repoUrl) {
//    pipeline{
//        agent any
//        stages {
//            stage("Tools initialization") {
//                steps {
//                   echo "hello ${repoUrl}"                       
//                   echo "Hi ${repoUrl}"
//                }
//            }
//        }
//    }
   
   stage('building') {
      steps {
        script {
           echo "HI ${repoUrl}"
        }
      }
    }
}
