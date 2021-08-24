package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DialogContent;
import pages.FormContent;
import pages.LeftNav;
import pages.Parent;

public class SalaryModifier {
    DialogContent mainContent = new DialogContent();
    LeftNav lf = new LeftNav();
    FormContent fc = new FormContent();

    @When("^click Human Resources then Setup then Salary Modifiers$")
    public void click_Human_Resources_then_Setup_then_Salary_Modifiers() {
        lf.clickFunction(lf.getHrButton());
        lf.clickFunction(lf.getSetupHRbutton());
        lf.clickFunction(lf.getSalaryModifiers());
    }


    @And("^enter search keyword and click search button$")
    public void enterSearchKeywordAndClickSearchButton() {
    mainContent.sendKeysFunction(mainContent.getFindDescription(), "newSalary");
    mainContent.clickFunction(mainContent.getSearchButton());

    }

    @Then("^click Delete button and confirm deleting$")
    public void clickDeleteButton() {
        mainContent.clickFunction(mainContent.getDeleteButton());
        mainContent.clickFunction(mainContent.getDeleteConfirmButton());
    }

    @Then("^click Add Button and fill the form fields \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"  and Save$")
    public void clickAddButtonAndFillTheFormFieldsAndSave(String arg0, String arg1, String arg2, String arg3)  {
        mainContent.clickFunction(mainContent.getAddButton());
        fc.sendKeysFunction(fc.getDescriptionField(), arg0);
        fc.sendKeysFunction(fc.getVariableField(), arg1);
        fc.sendKeysFunction(fc.getPriorityField(), arg2);
        fc.clickFunction(fc.getAmountField());
        fc.actionFillField(arg3);
        mainContent.clickFunction(mainContent.getSaveButton());
    }

    @Then("^click Edit and fill fields \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void clickEditAndFillFields(String arg0, String arg1, String arg2, String arg3) {
        mainContent.clickFunction(mainContent.getEditBtn());
        fc.sendKeysFunction(fc.getDescriptionField(), arg0);
        fc.sendKeysFunction(fc.getVariableField(), arg1);
        fc.sendKeysFunction(fc.getPriorityField(), arg2);
        fc.clickFunction(fc.getAmountField());
        fc.actionFillField(arg3);
        mainContent.clickFunction(mainContent.getSaveButton());
    }
}
