def call(Map config [:]) {
  stage('calling groovy script') {
      steps {
        script {
          echo 'hello' 
        }
      }
    }
}
