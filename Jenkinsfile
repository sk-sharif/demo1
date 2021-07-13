pipeline {
  environment {
    registry = "akanshagiriya/demo"
    registryCredential = 'Docker_cred'
  }
  agent any
  stages {
    stage('Cloning Git') {
      steps {
          git branch: 'main', url: 'https://github.com/sk-shardevelopemo1.git'
          sh 'git checkout -b develop || true'
      }
    }
     stage('Build Unit test') {
      steps{
        echo 'unit tests'
      }
    }
  }
}
