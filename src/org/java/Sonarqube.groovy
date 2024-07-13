package org.java

def call() {
    node {
        def npmHome = tool name: 'nodejs', type: 'jenkins.plugins.nodejs.tools.NodeJSInstallation'
        def scannerHome = tool name: 'sonar', type: 'hudson.plugins.sonar.SonarRunnerInstallation'

        withEnv(["PATH+NODEJS=${npmHome}/bin"]) {
            withSonarQubeEnv('sonar') {
                sh "npm install"
                sh "npm run build"
                sh "${scannerHome}/bin/sonar-scanner"
            }
        }
    }
}
