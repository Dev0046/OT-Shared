package org.java

def call() {
    def scannerHome = tool name: 'sonar', type: 'hudson.plugins.sonar.SonarRunnerInstallation'
    withSonarQubeEnv('sonar') {
        """sonar-scanner \
  -Dsonar.projectKey=frontend \
  -Dsonar.sources=. \
  -Dsonar.host.url=http://54.84.78.174:9000 \
  -Dsonar.token=sqp_acc9f32150eefcc25a6179434337b196c25e61d8"""
    }
}
