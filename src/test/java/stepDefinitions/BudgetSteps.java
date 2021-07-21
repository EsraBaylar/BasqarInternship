package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import pages.DialogContent;
import pages.LeftNav;

public class BudgetSteps {

    private final DialogContent dialogContent;
    private  final LeftNav leftNav;

    public BudgetSteps(DialogContent dialogContent,LeftNav leftNav) {
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
      dialogContent.sendKeysFunction(dialogContent.getDescription(), "my budget");
      dialogContent.selectByValue(dialogContent.getBudgetInfoStartDate(), "05/07/2021");
      dialogContent.selectByValue(dialogContent.getBudgetInfoEndDate(), "05/07/2022");
      dialogContent.clickFunction(dialogContent.getSaveButton());




    }



}
