def call(Map config = [:]) {
  parallel(
    "StageA": {
      stage("stage A") {
        steps {
          script {
            echo "This is branch a"
          }
        }
      }
    },
    "StageB": {
      stage("stage B") {
        steps {
          script {
            echo "This is branch b"
          }
        }
      }
    }
  )
}
