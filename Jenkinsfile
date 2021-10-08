/def branch = "${env.BRANCH_NAME}"
@Library('first-shared-lib') _
pipeline {
  agent any
  stages {
    stage('invoking the orchestration api') {
      steps {
        script {
          shared.invokingApi(branch: "${branch}")
        }
      }
    }
    stage('Triggring integration test') {
      steps {
        script {
          shared.integrationTest(branch: "${branch}")
        }
      }
    } 
  }
  post {
    success {
      script {
        db.logging(branch_name: "${branch}",action: "Environment ${branch} was provisioned")
      }
    }
    failure {
      script {
        db.logging(branch_name: "${branch}",action: "Environment ${branch} failed to provisioned")
      }
    }
  }
}
