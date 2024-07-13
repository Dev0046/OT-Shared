import org.java.Checkout
import org.java.CredScanning
import org.java.sonarqube

def checkoutgit(String gitUrl, String branch = 'main') {
    new Checkout().call(gitUrl, branch)
}
def callsonarqube() {
    new sonarqube().call()
}
def CredScanning() {
    new CredScanning().call()
}

