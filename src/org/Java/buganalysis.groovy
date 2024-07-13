package org.java

def call() {
    def scannerHome = tool name: 'sonar', type: 'hudson.plugins.sonar.SonarRunnerInstallation'
    withSonarQubeEnv('sonar') {
        sh """
              -Dsonar.projectKey=sonar 
              -Dsonar.projectName='sonar' 
              -Dsonar.host.url=http://54.84.78.174
              -Dsonar.token=sqp_f4b436a174bd4bc43f833a85fa392b290453c7da
        """
    }
}
