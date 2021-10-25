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
					script: 
						'return[\'us-east-1\',\'us-west-2\']'
				]
			]
		], 
		[$class: 'CascadeChoiceParameter', 
			choiceType: 'PT_SINGLE_SELECT', 
			filterLength: 1, 
			filterable: false, 
			name: 'resource', 
			randomName: 'choice-parameter-9559427745480', 
			referencedParameters: 'Region', 
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
					script: 
					'''if(Region.equals(\'us-east-1\')){
					return[\'non-prod-vpc1\',\'non-prod-vpc2\'] 
					}'''
				]
			]
		]
	])
])

pipeline {
  agent any
  stages {
    stage("Example") {
      steps {
        script {
          echo "${params.Region}"
          echo 'Hello'
        }
      }
    }
  }
}
