package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DialogContent;
import pages.FormContent;
import pages.LeftNav;

public class SalaryModifier {

    private final DialogContent dialogContent;
    private final LeftNav leftNav;
    private final FormContent formContent;

    public SalaryModifier(DialogContent dialogContent, LeftNav leftNav, FormContent formContent) {
        this.dialogContent = dialogContent;
        this.leftNav = leftNav;
        this.formContent = formContent;
    }

    @When("^click Human Resources then Setup then Salary Modifiers$")
    public void click_Human_Resources_then_Setup_then_Salary_Modifiers() {
        leftNav.clickFunction(leftNav.getHrButton());
        leftNav.clickFunction(leftNav.getSetupHRbutton());
        leftNav.clickFunction(leftNav.getSalaryModifiers());
    }


    @And("^enter search keyword and click search button$")
    public void enterSearchKeywordAndClickSearchButton() {
    dialogContent.sendKeysFunction(dialogContent.getFindDescription(), "newSalary");
    dialogContent.clickFunction(dialogContent.getSearchButton());

    }

//    @Then("^click Delete button and confirm deleting$")
//        public void clickDeleteButton() {
//            dialogContent.clickFunction(dialogContent.getDeleteButton());
//        dialogContent.clickFunction(dialogContent.getDeleteConfirmButton());
//    }

    @Then("^click Add Button and fill the form fields \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"  and Save$")
    public void clickAddButtonAndFillTheFormFieldsAndSave(String arg0, String arg1, String arg2, String arg3)  {
        dialogContent.clickFunction(dialogContent.getAddButton());
        formContent.sendKeysFunction(formContent.getDescriptionField(), arg0);
        formContent.sendKeysFunction(formContent.getVariableField(), arg1);
        formContent.sendKeysFunction(formContent.getPriorityField(), arg2);
        formContent.clickFunction(formContent.getAmountField());
        formContent.actionFillField(arg3);
        dialogContent.clickFunction(dialogContent.getSaveButton());
    }

    @Then("^click Edit and fill fields \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void clickEditAndFillFields(String arg0, String arg1, String arg2, String arg3) {
        dialogContent.clickFunction(dialogContent.getEditBtn());
        formContent.sendKeysFunction(formContent.getDescriptionField(), arg0);
        formContent.sendKeysFunction(formContent.getVariableField(), arg1);
        formContent.sendKeysFunction(formContent.getPriorityField(), arg2);
        formContent.clickFunction(formContent.getAmountField());
        formContent.actionFillField(arg3);
        dialogContent.clickFunction(dialogContent.getSaveButton());
    }
}
