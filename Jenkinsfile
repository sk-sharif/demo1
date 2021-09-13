import groovy.json.JsonSlurper;
@Library('first-shared-lib') _

def i=1
pipeline {
  agent any
  
  stages {
    stage('checking restapi') {
      steps {
        script {
          def flag = 0
          def count = 0
          arr = restapi.listsOfMachine()
          value = arr.getAt(1)
          def parser = new JsonSlurper()
          def json = parser.parseText(arr)
          echo "${json[0].Name}"
        }
      }
    }
  }
}
