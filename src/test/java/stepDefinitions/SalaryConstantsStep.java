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

    private final DialogContent dialogContent;
    private final LeftNav leftNav;
    private final FormContent formContent;

    public SalaryConstantsStep(DialogContent dialogContent, LeftNav leftNav, FormContent formContent) {
        this.dialogContent = dialogContent;
        this.leftNav = leftNav;
        this.formContent = formContent;
    }

    @When("^click Human Resources then Setup then Salary Constants$")
    public void click_Human_Resources_then_Setup_then_Salary_Constants() {
        leftNav.clickFunction(leftNav.getHrButton());
        leftNav.clickFunction(leftNav.getSetupHRbutton());
        leftNav.clickFunction(leftNav.getSalaryConstants());
    }

    @Then("^click Edit Button and fill the form fields \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"  and Save$")
    public void click_Edit_Button_and_fill_the_form_fields_and_Save(String name, String key, String value) {
        dialogContent.clickFunction(dialogContent.getEditBtn());
        formContent.sendKeysFunction(formContent.getNameField(), name);
        formContent.sendKeysFunction(formContent.getValueInput(), value);
        formContent.clickFunction(formContent.getKeyInput());
        Actions actions = new Actions(BaseWebDriver.getDriver());
        Action action = actions.moveToElement(formContent.getKeyInput())
                .click(formContent.getKeyInput())
                .sendKeys("key1")
                .sendKeys(Keys.ENTER)
                .build();
        action.perform();

        formContent.clickFunction(formContent.getValidFrominput());
        LocalDate today = LocalDate.now();
        DateTimeFormatter newFormat = DateTimeFormatter.ofPattern("dd");
        String formattedDate = today.format(newFormat);
        for (int i = 0; i < formContent.getCalendarList().size(); i++) {
            if (formContent.getCalendarList().get(i).getText().equals(formattedDate))
            {formContent.getCalendarList().get(i).click();
                break;}
        }
        dialogContent.clickFunction(dialogContent.getSaveButton());

    }

    @Then("^click Add Button and fill the form \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"  and Save$")
    public void clickAddButtonAndFillTheFormFieldsAndSave(String arg0, String arg2, String arg3)  {
        dialogContent.clickFunction(dialogContent.getAddButton());
        formContent.sendKeysFunction(formContent.getNameField(), arg0);
        formContent.sendKeysFunction(formContent.getValueInput(), arg3);

        formContent.clickFunction(formContent.getKeyInput());
        Actions actions = new Actions(BaseWebDriver.getDriver());
        Action action = actions.moveToElement(formContent.getKeyInput())
                .click(formContent.getKeyInput())
                .sendKeys("key1")
                .sendKeys(Keys.ENTER)
                .build();
        action.perform();

        formContent.clickFunction(formContent.getValidFrominput());
        LocalDate today = LocalDate.now();
        DateTimeFormatter newFormat = DateTimeFormatter.ofPattern("dd");
        String formattedDate = today.format(newFormat);
        for (int i = 0; i < formContent.getCalendarList().size(); i++) {
            if (formContent.getCalendarList().get(i).getText().equals(formattedDate))
            {formContent.getCalendarList().get(i).click();
            break;}
        }
        dialogContent.clickFunction(dialogContent.getSaveButton());
    }

}
