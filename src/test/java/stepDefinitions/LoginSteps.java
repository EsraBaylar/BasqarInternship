package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.DialogContent;
import utilies.BaseWebDriver;

public class LoginSteps {
    private DialogContent dialogContent;

    public LoginSteps(DialogContent dialogContent) {
        this.dialogContent = dialogContent;
    }

    @Given("^Navigate to Basqar$")
    public void navigate_to_Basqar() {

        WebDriver driver= BaseWebDriver.getDriver();
        driver.get("https://demo.mersys.io/");
        driver.manage().window().maximize();


    }

    @And("^Enter username and password$")
    public void enter_username_and_password()  {
        dialogContent.sendKeysFunction(dialogContent.getUsername(), "richfield.edu");
        dialogContent.sendKeysFunction(dialogContent.getPassword(), "Richfield2020!");
        dialogContent.clickFunction(dialogContent.getLoginbutton());



    }

    @Then("^Success message should be displayed$")
    public void success_message_should_be_displayed()  {

    Assert.assertNotNull(dialogContent.getSuccessmessage());
    }

}
