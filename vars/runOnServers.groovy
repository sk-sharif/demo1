def call(Map config = [:]) {
  parallel(
    "StageA": {
      stage("stage A") {
        echo "This is branch a"
        println(currentBuild.rawBuild.changeSets) // should print out any changes in the current build
      }
    },
    "StageB": {
      stage("stage B") {
        echo "This is branch b"
      }
    }
  )
}