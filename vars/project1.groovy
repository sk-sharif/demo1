def call(body) {
  def pipelineParams= [:]
  body.resolveStrategy = Closure.DELEGATE_FIRST
  body.delegate = pipelineParams
  body()
  
 pipeline {
  agent any 
  
  stages {
   stage('check') {
    steps {
     script {
      building.add(60)
     }
    }
   }
  }
 }
}
  
  
