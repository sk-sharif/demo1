def call(Closure closure) {
  parallel{
      node("test && san-jose") {
        stage('SanJose') {
          echo "SanJose"
        }
      }
      node('test dallas') {
        stage('Dallas') {
          echo "Dallas"
        }
      }  
    }
}
