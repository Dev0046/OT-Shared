package org.java

def call() {
    def scannerHome = tool name: 'sonar', type: 'hudson.plugins.sonar.SonarRunnerInstallation'
    withSonarQubeEnv('sonar') {
        'sh "${MVN_HOME}/bin/mvn clean package -Dmaven.test.skip=true sonar:sonar'
    }
}
