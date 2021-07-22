#!/usr/bin/env groovy
def gv
pipeline {
  agent any
  stages {
    stage('Deploy') {
      when {
// 	branch 'main'
 	expression { sh([returnStdout: true, script: 'echo $TAG_NAME | tr -d \'\n\'']) || params.BRANCH_NAME == 'main' }
// 	buildingTag()
      }
      steps {
        echo 'Replace this with your actual deployment steps'
      }
    }
  }
}
