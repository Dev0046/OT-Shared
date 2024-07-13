@Library('shared-lib') _

pipeline {
    agent any
    
    stages {
        stage('git checkout') {
            steps {
                script {
                    Frontend.checkoutgit('https://github.com/Dev0046/salary-api.git', 'main')
                }
            }
        }
        stage('Hello world') {
            steps {
                script {
                    Frontend.CodeCompilation()
                }
            }
        }
        
    }
}
