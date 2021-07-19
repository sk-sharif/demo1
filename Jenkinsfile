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
	  
	  stage('') {
		  steps {
			  script {
if (git branch --contains $(git rev-list -n 1 v1.0) | grep '^main$') {
				  	echo "done"
				  }
				  else {
				  	echo "failed"
				  }
			  }
		  }
	  }
  }
}
