import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @Given("User is in NetBanking Landing page")
    public void userIsInNetBankingLandingPage() {
        System.out.println("a");
    }

    @When("User login into application with username and password")
    public void userLoginIntoApplicationWithUsernameAndPassword() {
        System.out.println("b");
    }

    @Then("Home page is populated")
    public void homePageIsPopulated() {
        System.out.println("c");
    }

    @And("Cards are displayed")
    public void cardsAreDisplayed() {
        System.out.println("d");
    }

    @And("Welcome")
    public void welcome() {
    }
}
