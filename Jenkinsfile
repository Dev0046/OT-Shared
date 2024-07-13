@Library('shared-lib') _

pipeline {
    agent any

    environment {
        SONARQUBE_TOKEN = credentials('SONARQUBE_TOKEN') // Replace with your credential ID
    }
    
    stages {
        stage('git checkout') {
            steps {
                script {
                    frontend.checkoutgit('https://github.com/Dev0046/frontend.git', 'main')
                }
            }
        }
    
        stage('Sonarqube') {
            steps {
                script {
                    frontend.callSonarqube()
                }
            }
        }
        
        stage('Dependency Scanning') {
            steps {
                script {
                    frontend.Dependency()
                }
            }
        }
        
        stage('CredScanning') {
            steps {
                script {
                    frontend.CredScanning()
                }
            }
        }
    }
}
