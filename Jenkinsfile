#!/usr/bin/env groovy
def gv
pipeline {
  agent any
  stages {
    stage('Project1') {
      when {
        changeset "Project1/**"
      }
      steps {
	script {
// 	  build 'Project1'
	  gv = load "Project1"  
	}
      }
    }
  }
}
