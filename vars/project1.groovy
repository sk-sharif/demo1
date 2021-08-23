def call(body) {
  def pipelineParams= [:]
  body.resolveStrategy = Closure.DELEGATE_FIRST
  body.delegate = pipelineParams
  body()
  
 pipeline {
  agent any 
  
  stages {
   stage('check') {
     when {
       expression{env.BRANCH_NAME == 'develop' || env.BRANCH_NAME == 'test'}
     }
     hide true
    steps {
     script {
      building.add(60)
     }
    }
   }
  }
 }
}
  
  
