package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import pages.DialogContent;
import pages.FormContent;
import pages.LeftNav;
import utilies.BaseWebDriver;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SalaryConstantsStep {

    DialogContent mainContent = new DialogContent();
    LeftNav lf = new LeftNav();
    FormContent fc = new FormContent();


    @When("^click Human Resources then Setup then Salary Constants$")
    public void click_Human_Resources_then_Setup_then_Salary_Constants() {
        lf.clickFunction(lf.getHrButton());
        lf.clickFunction(lf.getSetupHRbutton());
        lf.clickFunction(lf.getSalaryConstants());
    }

    @Then("^click Edit Button and fill the form fields \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"  and Save$")
    public void click_Edit_Button_and_fill_the_form_fields_and_Save(String name, String key, String value) {
        mainContent.clickFunction(mainContent.getEditBtn());
        fc.sendKeysFunction(fc.getNameField(), name);
        fc.sendKeysFunction(fc.getValueInput(), value);
        fc.clickFunction(fc.getKeyInput());
        Actions actions = new Actions(BaseWebDriver.getDriver());
        Action action = actions.moveToElement(fc.getKeyInput())
                .click(fc.getKeyInput())
                .sendKeys("key1")
                .sendKeys(Keys.ENTER)
                .build();
        action.perform();

        fc.clickFunction(fc.getValidFrominput());
        LocalDate today = LocalDate.now();
        DateTimeFormatter newFormat = DateTimeFormatter.ofPattern("dd");
        String formattedDate = today.format(newFormat);
        for (int i = 0; i < fc.getCalendarList().size(); i++) {
            if (fc.getCalendarList().get(i).getText().equals(formattedDate))
            {fc.getCalendarList().get(i).click();
                break;}
        }
        mainContent.clickFunction(mainContent.getSaveButton());

    }

    @Then("^click Add Button and fill the form \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"  and Save$")
    public void clickAddButtonAndFillTheFormFieldsAndSave(String arg0, String arg2, String arg3)  {
        mainContent.clickFunction(mainContent.getAddButton());
        fc.sendKeysFunction(fc.getNameField(), arg0);
        fc.sendKeysFunction(fc.getValueInput(), arg3);

        fc.clickFunction(fc.getKeyInput());
        Actions actions = new Actions(BaseWebDriver.getDriver());
        Action action = actions.moveToElement(fc.getKeyInput())
                .click(fc.getKeyInput())
                .sendKeys("key1")
                .sendKeys(Keys.ENTER)
                .build();
        action.perform();

        fc.clickFunction(fc.getValidFrominput());
        LocalDate today = LocalDate.now();
        DateTimeFormatter newFormat = DateTimeFormatter.ofPattern("dd");
        String formattedDate = today.format(newFormat);
        for (int i = 0; i < fc.getCalendarList().size(); i++) {
            if (fc.getCalendarList().get(i).getText().equals(formattedDate))
            {fc.getCalendarList().get(i).click();
            break;}
        }
        mainContent.clickFunction(mainContent.getSaveButton());
    }

}
