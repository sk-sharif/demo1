def call(Map config = [:]) {
 parallel({
    SanJose: {
      node {
        stage('SanJose') {
          echo "sanjose"
        }
      } 
    },
    Dallas: {
      node {
        stage('Dallas') {          
          echo "dallas"
        }
      } 
    } 
  } 
}
