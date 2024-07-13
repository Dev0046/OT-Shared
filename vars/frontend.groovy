import org.java.Checkout
import org.java.CredScanning
import org.java.Sonarqube
import org.java.License

def checkoutgit(String gitUrl, String branch = 'main') {
    new Checkout().call(gitUrl, branch)
}
def callSonarqube() {
    new Sonarqube().call()
}
def License() {
    new License().call()
}
def CredScanning() {
    new CredScanning().call()
}

