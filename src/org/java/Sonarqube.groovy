package org.java


def scannerHome = tool 'sonar';
withSonarQubeEnv() {
      sh "${scannerHome}/bin/sonar-scanner"
    }
  
