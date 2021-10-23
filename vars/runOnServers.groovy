def call(Map config = [:]) {
  parallel{
      node {
        stage('SanJose') {
          echo "SanJose"
        }
      }
      node {
        stage('Dallas') {
          echo "Dallas"
        }
      }  
    }
}
