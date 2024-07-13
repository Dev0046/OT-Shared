import org.java.Checkout
import org.java.CredScanning
import org.java.Sonarqube

def checkoutgit(String gitUrl, String branch = 'main') {
    new Checkout().call(gitUrl, branch)
}
def callSonarqube() {
    new Sonarqube().call()
}
def Dependency() {
    new Dependency().call()
}
def CredScanning() {
    new CredScanning().call()
}

