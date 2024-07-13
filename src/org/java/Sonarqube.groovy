package org.java


def scannerHome = tool 'SonarScanner';
withSonarQubeEnv() {
      sh "${scannerHome}/bin/sonar-scanner"
    }
  
