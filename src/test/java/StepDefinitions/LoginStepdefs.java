package StepDefinitions;

import Pages.DialogContent;
import Utilities.BaseDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginStepdefs {

  DialogContent dc=new DialogContent();


    @Given("^Navigate to basqar$")
    public void navigateToBasqar() {
        WebDriver driver = BaseDriver.getDriver();
        driver.get("https://demo.mersys.io/");
        driver.manage().window().maximize();
    }

    @And("^Enter username and password and click login button$")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        dc.sendKeysFunction(dc.getUsername(), "richfield.edu");
        dc.sendKeysFunction(dc.getPassword(), "Richfield2020!");
        dc.clickFunction(dc.getLoginButton());
        dc.clickFunction(dc.getAcceptCookies());

    }

    @Then("^User should login successfully$")
    public void userShouldLoginSuccessfully() {
        dc.waitUntilVisible(dc.getDashboard());
        System.out.println("dc.getDashboard()= " + dc.getDashboard().getText());
        Assert.assertEquals(dc.getDashboard().getText(), "Dashboard");

    }
}
