package org.java

def call() {
    // Using triple quotes for multi-line shell script
    sh '''
        trivy repo https://github.com/Dev0046/frontend.git --format json -o trivy-license-report.json
    '''
}
