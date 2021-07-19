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
if (git rev-list --first-parent main | grep $tagged_commit >/dev/null) {
				  	echo "done"
				  }
				  else {
				  	echo "failed"
				  }
			  
		  }
	  }
  }
}
