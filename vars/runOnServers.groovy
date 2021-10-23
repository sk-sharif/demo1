def call(Map config = [:]) {
  parallel(
    "StageA": {
      stage("stage A") {
        echo "This is branch a"
        println(currentBuild.rawBuild.changeSets) // should print out any changes in the current build
        def changeSet = currentBuild.rawBuild.changeSets
        println(changeSet.size())
        println(changeSet[0].items)
      }
    },
    "StageB": {
      stage("stage B") {
        when {
          changeset "vars/**"
        }
        echo "This is branch b"
      }
    }
  )
}

// @NonCPS
// def changeLogs() {
//     def author = ""
// def changeSet = currentBuild.rawBuild.changeSets               
// for (int i = 0; i < changeSet.size(); i++) 
// {
//    def entries = changeSet[i].items;
//    for (i = 0; i < changeSet.size(); i++) 
//             {
//                        entries = changeSet[i].items;
//                        def entry = entries[0]
//                        author += "${entry.author}"
//             } 
//  }
//  print author;
// }
