package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import pages.DialogContent;
import pages.LeftNav;


public class BudgetSteps {

    private final DialogContent dialogContent;
    private final LeftNav leftNav;

    public BudgetSteps(DialogContent dialogContent, LeftNav leftNav) {
        this.dialogContent = dialogContent;
        this.leftNav = leftNav;
    }


    @And("^Navigate to budget page$")
    public void navigateToBudgetPage() {
        leftNav.clickFunction(leftNav.getBudget());
        leftNav.clickFunction(leftNav.getSetupTwo());
        leftNav.clickFunction(leftNav.getBudgetGroups());


    }

    @When("^Create a budget$")
    public void createABudget() {
        dialogContent.clickFunction(dialogContent.getAddButton());
        dialogContent.sendKeysWithActions(dialogContent.getDescription(), "my Budget4");
        dialogContent.clickFunction(dialogContent.getBtnDate());
        dialogContent.clickFunction(dialogContent.getDate());
        dialogContent.clickFunction(dialogContent.getBtndate2());
        dialogContent.clickFunction(dialogContent.getCookiesaccept());
        dialogContent.clickFunction(dialogContent.getDate2());
        dialogContent.clickFunction(dialogContent.getSave());

    }


    @Then("^click Edit$")
    public void clickEdit() {
        dialogContent.clickFunction(dialogContent.getCookiesaccept());
        dialogContent.clickFunction(dialogContent.getDeleteInputName2());
        dialogContent.sendKeysFunction(dialogContent.getDeleteInputName2(), "my Budget4");
        dialogContent.clickFunction(dialogContent.getDeleteSearch());
        dialogContent.waitUntilListLessThan(By.cssSelector("ms-edit-button>button"),3);
        dialogContent.clickFunction(dialogContent.getBtnEdit());
        dialogContent.clickFunction(dialogContent.getBtndate2());
        dialogContent.clickFunction(dialogContent.getDate3());
        dialogContent.clickFunction(dialogContent.getSave());


    }

    @Then("^click Delete button and confirm deleting$")
    public void clickDeleteButtonAndConfirmDeleting() {
        dialogContent.clickFunction(dialogContent.getDeleteInputName2());
        dialogContent.sendKeysFunction(dialogContent.getDeleteInputName2(), "my Budget4");
        dialogContent.clickFunction(dialogContent.getCookiesaccept());
        dialogContent.clickFunction(dialogContent.getDeleteSearch());
        // dialogContent.waitUntilClickable(dialogContent.getDelete1());
        dialogContent.waitUntilListLessThan(By.xpath("//ms-delete-button//button"),3);
        dialogContent.clickFunction(dialogContent.getDeleteButton());
        dialogContent.clickFunction(dialogContent.getDeleteConfirmBtn());


    }
}
