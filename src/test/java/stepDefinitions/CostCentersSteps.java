package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import pages.DialogContent;
import pages.LeftNav;
import utilies.BaseWebDriver;

import java.util.List;

public class CostCentersSteps {

    private final DialogContent dc;
    private final LeftNav ln;

    public CostCentersSteps(DialogContent dc, LeftNav ln) {
        this.dc = dc;
        this.ln = ln;
    }

    @Then("^Click on the Budget$")
    public void click_on_the_Budget()  {

        ln.clickFunction(ln.getBudget());
    }

    @Then("^Click on the Setup$")
    public void click_on_the_Setup()  {

        ln.clickFunction(ln.getSetupTwo());

    }

    @Then("^Click on the Costcenters$")
    public void click_on_the_Costcenters()  {

        ln.clickFunction(ln.getCostCenters());

    }

    @Then("^Click on the add button$")
    public void click_on_the_add_button() {
        dc.clickFunction(dc.getCostAdd());
    }

    @And("^Fill the required fields$")
    public void fillTheRequiredFields(List<String> list) {
        dc.sendKeysFunction(dc.getSubjectsName(), list.get(0));
        dc.sendKeysFunction(dc.getSubjectsCode(), list.get(1));
        dc.clickFunction(dc.getType());
        dc.clickFunction(dc.getPersonal());
        Actions actions = new Actions(BaseWebDriver.getDriver());
        Action action=actions.sendKeys(dc.getPrefixes(),list.get(2)).build();
        action.perform();
    }


    @When("^Click on the save button$")
    public void click_on_the_save_button()  {
        dc.clickFunction(dc.getSaveButton());
    }

    @Then("^Click on the Delete button$")
    public void click_on_the_Delete_button()  {
        dc.clickFunction(dc.getDelete1());
    }

    @When("^User clicks on the delete button$")
    public void user_clicks_on_the_delete_button()  {
        dc.clickFunction(dc.getDelete2());

    }
}

