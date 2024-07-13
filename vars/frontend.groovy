import org.java.Checkout
import org.java.CodeCompilation

def checkoutgit(String gitUrl, String branch = 'main') {
    new Checkout().call(gitUrl, branch)
}
def callCodeCompilation() {
    new CodeCompilation().call()
}
