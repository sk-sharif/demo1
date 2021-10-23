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
        echo "This is branch b"
      }
    }
  )
}

@NonCPS
def changeLogs() {
    String msg = ""
    String repoUrl = 'BITBUCKET_REPO_URL'
    def lastId = null
    def prevId = prevBuildLastCommitId()
    def changeLogSets = currentBuild.changeSets

    for (int i = 0; i < changeLogSets.size(); i++) {
        def entries = changeLogSets[i].items
        for (int j = 0; j < entries.length; j++) {
            def entry = entries[j]
            lastId = entry.commitId
            msg = msg + "${commitInfo(entry)}"
        }
    }
    if (prevId != null && lastId != null) {
        msg = msg + "\n${repoUrl}/branches/compare/${lastId}..${prevId}#diff\n"
    }
    println(msg)
}
