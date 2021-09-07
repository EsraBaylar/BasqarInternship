package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.ExelUtility;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import java.util.List;

public class SubjectCategoriesSteps {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();
    @When("^click on Education/Education/SubjectCategories$")
    public void clickOnEducationEducationSubjectCategories() {
        ln.clickFunction(ln.getEducation());
        ln.clickFunction(ln.getEdusetup());
        ln.clickFunction(ln.getSubjectcategories());
    }

    @And("^Add new SubjectCategorie$")
    public void addNewSubjectCategorie() {
        ln.clickFunction(ln.getAddButton());

    }

    @And("^Create a new SubjectCategorie name as \"([^\"]*)\" code as \"([^\"]*)\"$")
    public void createANewSubjectCategorieNameAsCodeAs(String nameInput, String codeInput) {
        dc.sendKeysFunction(dc.getNameInput(),nameInput);
        dc.sendKeysFunction(dc.getCodeInput(),codeInput);
        dc.clickFunction(dc.getSaveButton());
    }

    @And("^Delete a SubjectCategorie name as \"([^\"]*)\"$")
    public void deleteASubjectCategorieNameAsCodeAs(String nameInput) {
        dc.scrollToUpElement(dc.getRightScroll());
        dc.deleteSearchFunction(dc.getSearchNameInput(),dc.getSearchButton(),nameInput);
        dc.deleteFunction(dc.getfirstDelete(), dc.getDeleteBtn());
    }


}



