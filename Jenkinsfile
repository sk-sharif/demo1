#!/usr/bin/env groovy

pipeline {
  agent any
  stages {
    stage('Project1') {
      when {
        changeset "Project1/**"
      }
      steps {
	script {
	  build 'Project1'
	}
      }
    }
  }
}
