def call() {
  pipeline {
    agent any 
    
    stages {
      stage("vars") {
        steps {
          sh ' echo building the application'
        }
      }
    }
  }
}
