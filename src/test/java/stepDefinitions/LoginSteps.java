package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.DialogContent;
import utilies.BaseWebDriver;
import utilies.ExcelData;

import java.util.List;

public class LoginSteps {

    private final DialogContent dialogContent;
    List<List<String>> loginData= ExcelData.getList("src/test/java/resources/LoginData.xlsx","Login",4);

    public LoginSteps(DialogContent dialogContent) {

        this.dialogContent = dialogContent;
    }

    @Given("^Navigate to Basqar$")
    public void navigate_to_Basqar() {
        WebDriver driver = BaseWebDriver.getDriver();
        driver.get("https://demo.mersys.io/");
        driver.manage().window().maximize();
    }

    @Then("^Enter valid username and password$")
    public void enterValidUsernameAndPassword() {

        dialogContent.clickFunction(dialogContent.getAcceptCookies());
        dialogContent.sendKeysFunction(dialogContent.getUsername(), loginData.get(1).get(0));
        dialogContent.sendKeysFunction(dialogContent.getPassword(), loginData.get(1).get(1));
        dialogContent.clickFunction(dialogContent.getLoginBtn());
    }

    @Then("^Success message should be displayed$")
    public void success_message_should_be_displayed()  {
        dialogContent.verifyElementContainsText(dialogContent.getDashboard(),"Dashboard");
    }

    @Then("^Enter invalid username and password$")
    public void enterInvalidUsernameAndPassword() {
        dialogContent.clickFunction(dialogContent.getAcceptCookies());
        dialogContent.sendKeysFunction(dialogContent.getUsername(), loginData.get(1).get(2));
        dialogContent.sendKeysFunction(dialogContent.getPassword(), loginData.get(1).get(3));
        dialogContent.clickFunction(dialogContent.getLoginBtn());
    }

    @Then("^Error message should be displayed$")
    public void errorMessageShouldBeDisplayed() {
        dialogContent.verifyElementContainsText(dialogContent.getLoginErrorMsg(),"Invalid");

    }

}
