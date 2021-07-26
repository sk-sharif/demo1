def call(body) {
  def pipelineParams= [:]
  body.resolveStrategy = Closure.DELEGATE_FIRST
  body.delegate = pipelineParams
  body()
  
  pipeline{
    agent any 
    stages {
      stage('buildig') {
        steps {
          sh 'echo pipelineParams.name building'
        }
      }
    }
  }
}
