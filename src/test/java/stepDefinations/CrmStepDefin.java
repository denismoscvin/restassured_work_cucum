package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class CrmStepDefin {
    private WebDriver driver;
    private String baseUrl = "https://crm-dev.gbl-systems.com/login"; // Update this URL

    @Given("the user is on the CRM Admin Panel login page")
    public void userIsOnLoginPage() {
        System.setProperty("webdriver.chrome.driver", "C://Users/User/IdeaProjects/libs/drivers");
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }

    @When("the user enters valid email {string} and password {string}")
    public void enterValidCredentials(String email, String password) {
        WebElement emailField = driver.findElement(By.xpath("/html/body/app-root/div/kendo-drawer-container/kendo-drawer-content/div[2]" +
                "/main/app-login/div/div/div/div/div/form/div[1]/input"));
        WebElement passwordField = driver.findElement(By.xpath("/html/body/app-root/div/kendo-drawer-container/kendo-drawer-content/div[2]" +
                "/main/app-login/div/div/div/div/div/form/div[2]/input"));

        emailField.sendKeys("Aa963258741!@");
        passwordField.sendKeys("denis.m@gbl-factory.com");

    }

    @And("the user clicks the Login button")
    public void clickLoginButton() {
        WebElement loginButton = driver.findElement(By.xpath("/html/body/app-root/div/kendo-drawer-container/kendo-drawer-content/div[2]" +
                "/main/app-login/div/div/div/div/div/form/div[4]/button"));
        loginButton.click();
    }

    @Then("the user should be successfully logged in and see the dashboard")
    public void verifySuccessfulLogin() {
        String currentUrl = driver.getCurrentUrl();
        assertEquals("Expected dashboard URL", currentUrl);

        String welcomeMessage = driver.findElement(By.className("welcome")).getText();
        assertTrue(welcomeMessage.contains("Welcome"));

        driver.quit();
    }

}

