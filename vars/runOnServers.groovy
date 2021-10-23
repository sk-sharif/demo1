def call(Map config = [:]) {
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
