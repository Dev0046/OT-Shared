package org.java

def call() {
    def scannerHome = tool name: 'sonar', type: 'hudson.plugins.sonar.SonarRunnerInstallation'
    withSonarQubeEnv('sonar') {
        'sh "${scannerHome}/bin/sonar-scanner"'
    }
}
