package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DialogContent;
import pages.LeftNav;
import utilies.BaseWebDriver;

public class EducationSubjectsSteps {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();


    @When("^Click on education$")
    public void click_on_education() {
        ln.clickFunction(ln.getEducation());

    }

    @When("^Click on Setup$")
    public void click_on_Setup() {
        ln.clickFunction(ln.getEducationSetup());

    }

    @When("^Click on Subjects$")
    public void click_on_Subjects() {
        ln.clickFunction(ln.getSubjects());

    }

    @When("^Click on addSubjects$")
    public void click_on_addSubjects() {
        dc.clickFunction(dc.getSubjectsAddButton());

    }

    @When("^Add a Subjects  name as \"([^\"]*)\" Subjects code\"([^\"]*)\"$")
    public void add_a_Subjects_name_as_Subjects_code(String name, String code) {
        dc.waitUntilClickable(dc.getSubjectsName());
        dc.sendKeysFunction(dc.getSubjectsName(), name);
        dc.sendKeysFunction(dc.getSubjectsCode(), code);
    }


    @When("^Click on Subjects catagort$")
    public void click_on_Subjects_catagort() {
        dc.clickFunction(dc.getSubjectsCatagory());

    }

    @When("^Click on InformationTechnology$")
    public void click_on_InformationTechnology() {
        dc.clickFunction(dc.getInformationTechnology());

    }

    @When("^Click on Save Button$")
    public void click_on_Save_Button() {
        dc.clickFunction(dc.getSave());
    }

    @When("^delete inputName \"([^\"]*)\"$")
    public void delete_inputName(String name) {
        dc.sendKeysFunction(dc.getDeleteInputName2(), name);

    }

    @When("^click search button$")
    public void click_search_button() {
        dc.clickFunction(dc.getDeleteSerch());

    }

    @When("^click  on delete buttons$")
    public void click_on_delete_buttons() {

        WebDriverWait wait = new WebDriverWait(BaseWebDriver.getDriver(), 10);
        wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.xpath("//ms-delete-button[@table='true']//button"), 3));
        dc.clickFunction(dc.getDelete1());
        dc.clickFunction(dc.getDelete2());
        //dc.myWait(3);
    }

    @Then("^User should see success message$")
    public void userShouldSeeSuccessMessage() {
        dc.verifyElementContainsText(dc.getSuccessMessage(), "success");
        WebDriverWait wait=new WebDriverWait(BaseWebDriver.getDriver(),10);
        wait.until(ExpectedConditions.invisibilityOf(dc.getSuccessMessage()));
    }
}




