pipeline {
  environment {
    registry = "akanshagiriya/demo"
    registryCredential = 'Docker_cred'
  }
  agent any
  stages {
    stage('Cloning Git') {
      steps {
          git branch: 'main', url: 'https://github.com/sk-sharif/demo1.git'
          sh 'git checkout -b feature || true'
      }
    }
     stage('Build Unit test') {
      steps{
        echo 'unit tests'
      }
    }
  }
}
