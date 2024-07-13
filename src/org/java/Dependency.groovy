package org.java

def call() {
    // Using triple quotes for multi-line shell script
    sh '''
        trivyOutput=$(trivy --exit-code 1 --severity HIGH --no-progress /path/to/your/app)
        echo "Trivy Scan Results:"
        echo "${trivyOutput}"
        
        # Check if Trivy found High or Critical vulnerabilities
        if [[ "${trivyOutput}" == *"High"* || "${trivyOutput}" == *"Critical"* ]]; then
            error "Security vulnerabilities found"
        fi
    '''
}
