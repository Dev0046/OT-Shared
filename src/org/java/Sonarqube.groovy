package org.java

def call() {
    def scannerHome = tool name: 'sonar', type: 'hudson.plugins.sonar.SonarRunnerInstallation'
    withSonarQubeEnv('sonar') {
        sh """
        # Install npm dependencies
        npm install
        
        # Run any necessary build commands (if applicable)
        npm run build

        # Execute SonarQube scanner to analyze your code
        ${scannerHome}/bin/sonar-scanner \
        -Dsonar.projectKey=frontend 
       -Dsonar.sources=. 
       -Dsonar.host.url=http://54.84.78.174:9000 
       -Dsonar.token=sqp_13bafe53f7ecf3f7e95f6095b12a661104111fbb
        """
    }
}
