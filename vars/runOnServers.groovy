def call(Closure closure) {
  parallel({
    SanJose: {
      node("test && san-jose") {
        stage('SanJose') {
          closure()
        }
      } 
    },
    Dallas: {
      node('test dallas') {
        stage('Dallas') {
          closure()
        }
      } 
    } 
  } 
}
