#!/usr/bin/env groovy
def gv
pipeline {
  agent any
  stages {
//     stage('Project1') {
//       when {
//         changeset "Project1/**"
//       }
//       steps {
// 	script {
// 	  build 'Project1'
// //	  gv = load "Project1/script.groovy"  
// 	}
//       }
//     }
	  
// 	stage('Build Release') {
// 		when { tag "b1.0.1", comparator: "REGEXP"}
// //               when { tag pattern: "\\d+\\.\\d+\\.\\d", comparator: "REGEXP"}
//      steps {
//        echo "Building"
//      }
//         }
	  stage('Deploy') {
  when { 
// 	  branch 'main'
// 	  expression { sh([returnStdout: true, script: 'echo $TAG_NAME | tr -d \'\n\'']) } }
	  buildingTag()
  }
  steps {
    echo 'Replace this with your actual deployment steps'
  }
}

  }
}
