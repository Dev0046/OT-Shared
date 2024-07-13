import org.java.Checkout
import org.java.CredScanning
import org.java.sonarqube

def checkoutgit(String gitUrl, String branch = 'main') {
    new Checkout().call(gitUrl, branch)
}
def CredScanning() {
    new CredScanning().call()
}
def callsonarqube() {
    new sonarqube().call()
}
