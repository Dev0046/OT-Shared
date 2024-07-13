package org.java

def call() {
    sh '''
        ${DEPENDENCY_CHECK_HOME}/bin/dependency-check.sh --scan . --format ALL
    '''
}
