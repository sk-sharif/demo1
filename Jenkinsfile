@Library('first-shared-lib') _
properties([
	parameters([
		[$class: 'CascadeChoiceParameter', 
			choiceType: 'PT_SINGLE_SELECT', 
			filterLength: 1, 
			filterable: false, 
			name: 'Region', 
			randomName: 'choice-parameter-9559414509244', 
			referencedParameters: '',
			script: [
				$class: 'GroovyScript', 
				fallbackScript: [
					classpath: [], 
					sandbox: false, 
					script: ''
				], 
				script: [
					classpath: [], 
					sandbox: false, 
					script: 'return[\'us-east-1\',\'us-south-2\']'
				]
			]
		], 
	])
])

pipeline {
  
  agent any
  stages {
      stage ("Example") {
        steps {
         script{
		      echo "${params.Region}"
          echo 'Hello'
        } 
      }
    }
  }
}

