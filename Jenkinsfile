// @Library('first-shared-lib') _
// properties([
// 	parameters([
// 		[$class: 'CascadeChoiceParameter', 
// 			choiceType: 'PT_SINGLE_SELECT', 
// 			filterLength: 1, 
// 			filterable: false, 
// 			name: 'Region', 
// 			randomName: 'choice-parameter-9559414509244', 
// 			referencedParameters: '',
// 			script: [
// 				$class: 'GroovyScript', 
// 				fallbackScript: [
// 					classpath: [], 
// 					sandbox: true, 
// 					script: ''
// 				], 
// 				script: [
// 					classpath: [], 
// 					sandbox: true, 
// 					script: 
// 						'return[\'sarose\',\'bidhan\',\'virat\']'
// 				]
// 			]
// 		], 
// 		[$class: 'CascadeChoiceParameter', 
// 			choiceType: 'PT_SINGLE_SELECT', 
// 			filterLength: 1, 
// 			filterable: false, 
// 			name: 'resource', 
// 			randomName: 'choice-parameter-9559427745480', 
// 			referencedParameters: 'Region', 
// 			script: [
// 				$class: 'GroovyScript', 
// 				fallbackScript: [
// 					classpath: [], 
// 					sandbox: true, 
// 					script: ''
// 				], 
// 				script: [
// 					classpath: [], 
// 					sandbox: true, 
// 					script: 
// 					'''if(Region.equals(\'bidhan\')){
// return[\'non-prod-vpc1\',\'non-prod-vpc2\'] 
// }'''
// 				]
// 			]
// 		]
// 	])
// ])

// pipeline {
//   agent any
//   stages {
//     stage("Example") {
//       steps {
//         script {
//           echo "${params.Region}"
//           echo 'Hello'
//         }
//       }
//     }
//   }
// }



pipeline {
	agent any
// 	properties(parameters([choice(choices: ['true', 'false'], name: 'verbose')]))
	parameters {
    		choice(
			name: 'myParameter',
			choices: "Option1\nOption2",
			description: 'interesting stuff' )
  	}
	stages {
		stage("choice parameters") {
			steps {
				script {
					echo "choosed ${myParameter}"	
				}
			}
		}
	}
}














