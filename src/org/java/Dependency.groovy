package org.java

def call() {
    // Using triple quotes for multi-line shell script
    sh '''
       sh 'trivy repo https://github.com/OT-MICROSERVICES/frontend.git --format json -o trivy-license-report.json'
    '''
}
