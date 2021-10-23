def call(Map config = [:]) {
 parallel({
       node {
         stage('SanJose') {
           echo "sanjose"
         }
       } 
    node {
     stage('Dallas') {          
      echo "dallas"
     }
    }
  })
}
