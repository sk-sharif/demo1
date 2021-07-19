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
			  	if (git rev-list --first-parent master) | grep $tagged_commit >/dev/null; then
				  echo "$tag points to a commit reachable via first-parent from master"
				  else
					  echo "$tag does not point to a commit reachable via first-parent from master"
				  fi
			  }
		  }
	  }
  }
}
