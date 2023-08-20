import cucumber.api.junit.Cucumber;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.runner.RunWith;

public class MyStepdefs {
    @Given("User is in NetBanking Landing page")
    public void userIsInNetBankingLandingPage() {
        System.out.println("a");
    }

    @When("User login into application with login {string} and password {string}")
    public void userLoginIntoApplicationWithLoginAndPassword(String arg0, String arg1) {
        System.out.println(arg0);
        System.out.println(arg1);
    }

    @Then("Home page is populated")
    public void homePageIsPopulated() {
        System.out.println("c");
    }

    @And("Cards are displayed")
    public void cardsAreDisplayed() {
        System.out.println("d");
    }

}
