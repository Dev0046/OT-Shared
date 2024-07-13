package org.java

def call() {
    sh '''
        def trivyOutput = sh(script: 'trivy --exit-code 1 --severity HIGH --no-progress /path/to/your/app', returnStdout: true).trim()
                    echo "Trivy Scan Results:\n${trivyOutput}"
                    
                    // You can optionally fail the build based on Trivy results
                    if (trivyOutput.contains('High') || trivyOutput.contains('Critical')) {
                        error 'Security vulnerabilities found'L
    '''
}
