def call(Map config = [:]) {
  parallel(
    "StageA": {
      stage("stage A") {
        echo "This is branch a"
      }
    },
    "StageB": {
      stage("stage B") {
        echo "This is branch b"
      }
    }
  )
}
