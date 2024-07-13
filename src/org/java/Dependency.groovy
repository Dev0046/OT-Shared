package org.java

def call() {
    // Using triple quotes for multi-line shell script
    sh '''
        trivy image -f json -o trivy-license-report.json OT-MICROSERVICES/frontend
        archiveArtifacts artifacts: 'trivy-license-report.json', allowEmptyArchive: true
    '''
}
