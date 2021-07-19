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
			  	if test $(git rev-parse master) = $(git rev-parse $tag^{commit}); then
    echo "master and $tag both identify the same commit"
else
    echo "master and $tag identify two different commits"
fi
			  }
		  }
	  }
  }
}
