package stepDefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import pages.DialogContent;
import pages.LeftNav;

public class HumanResourcesSteps {
    private final DialogContent dc;
    private final LeftNav ln;

    public HumanResourcesSteps(DialogContent dc, LeftNav ln) {
        this.dc = dc;
        this.ln = ln;
    }

    @When("^Click to Human Resources and Setup and Position Salary$")
    public void clickToHumanResourcesAndSetupAndPositionSalary() {
        ln.clickFunction(ln.getHumanRsrcClick());
        ln.clickFunction(ln.getSetupClick());
        ln.clickFunction(ln.getPositionSalary());
        dc.clickFunction(dc.getAddButtonSalary());

    }

    @And("^Add Position Salary$")
    public void addPositionSalary() {
        dc.sendKeysFunction(dc.getNewSalary(), "Software Testing");
        dc.clickFunction(dc.getSave());

    }

    @And("^Delete to Position Salary$")
    public void deleteToPositionSalary() {
        dc.clickFunction(dc.getSearchButton());
        dc.sendKeysFunction(dc.getSearchInput(), "Software Testing");
        dc.clickFunction(dc.getDeleteButton());
        dc.clickFunction(dc.getDeleteButton2());

    }

    @When("^Click to Positions$")
    public void clickToPositions() {
        ln.clickFunction(ln.getPositionsClick());
        dc.clickFunction(dc.getAddpositionsClick());
    }


    @And("^Add position and Name and ShortName$")
    public void addPositionAndNameAndShortName() {
        dc.sendKeysFunction(dc.getInputPositionsName(), "Softwareenwicklungs");
        dc.sendKeysFunction(dc.getInputPositionsShortName(), "IT");
    }

    @And("^Save and Delete to Positions$")
    public void saveAndDeleteToPositions() {
        dc.clickFunction(dc.getSave());
        dc.clickFunction(dc.getSearchButton());

        dc.sendKeysFunction(dc.getInputPositionsNameSearch(),"Softwareenwicklungs");
        dc.sendKeysFunction(dc.getInputPositionsShortNameSearch(),"IT");
        dc.clickFunction(dc.getDeleteButton());
        dc.clickFunction(dc.getDeleteButton2());

    }

    @And("^Then Success message should be displayed$")
    public void thenSuccessMessageShouldBeDisplayed() {
        dc.clickFunction(dc.getSuccessMessage());
    }
}
