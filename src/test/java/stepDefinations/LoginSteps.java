package stepDefinations;

import cucumber.api.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class LoginSteps {
    private WebDriver driver;
    private String baseUrl = "https://crm-dev.gbl-systems.com/login"; // Update this URL

    @Given("^the user is on the login page$")
    public void the_user_is_on_the_login_page() {
        System.setProperty("webdriver.chrome.driver", "C://Users/User/IdeaProjects/libs/drivers");
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }

    @When("^the user enters a valid username and password$")
    public void the_user_enters_a_valid_username_and_password() {
        driver.findElement(By.xpath("/html/body/app-root/div/kendo-drawer-container/kendo-drawer-content/div[2]/main/app-login/div/div/div/div/div/form/div[1]/input")).sendKeys("denis.m@gbl-factory.com");
        driver.findElement(By.xpath("/html/body/app-root/div/kendo-drawer-container/kendo-drawer-content/div[2]/main/app-login/div/div/div/div/div/form/div[2]/input")).sendKeys("Aa963258741!@");
    }

    @And("^clicks the \"Login\" button$")
    public void clicks_the_Login_button() {
        driver.findElement(By.xpath("/html/body/app-root/div/kendo-drawer-container/kendo-drawer-content/div[2]/main/app-login/div/div/div/div/div/form/div[4]/button")).click();
    }

    @Then("^the user should be redirected to the dashboard$")
    public void the_user_should_be_redirected_to_the_dashboard() {
        String currentUrl = driver.getCurrentUrl();
        assertEquals("Expected dashboard URL", currentUrl);
    }

    @Then("^see a welcome message on the dashboard$")
    public void see_a_welcome_message_on_the_dashboard() {
        String welcomeMessage = driver.findElement(By.className("welcome")).getText();
        assertTrue(welcomeMessage.contains("Welcome"));
    }

    // Similar step definitions for negative scenarios...
}