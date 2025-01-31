pipeline {
	agent any
	environment {
		PATH = "/opt/apache-maven-3.6.3/bin:$PATH"
	}
	stages {
		stage("clone code"){
			steps{
				git credentialsId: 'git_credentials', url: 'https://github.com/dhamushkasampath/mini-java-learn'
			}
		}
		stage("build code"){
			steps{
				sh "mvn clean install"
			}
		}
	}
}