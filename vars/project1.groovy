def call(body) {
//   def pipelineParams= [:]
//   body.resolveStrategy = Closure.DELEGATE_FIRST
//   body.delegate = pipelineParams
//   body()
 sh "echo hi" 
}
  
  
