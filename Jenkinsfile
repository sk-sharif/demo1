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
	  
	stage('Build Release') {
		when { tag pattern: "b1.0.1"}
//               when { tag pattern: "\\d+\\.\\d+\\.\\d", comparator: "REGEXP"}
     steps {
       echo "Building"
     }
        }
  }
}
