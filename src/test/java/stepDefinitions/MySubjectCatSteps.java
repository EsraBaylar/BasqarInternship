package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import pages.DialogContent;
import pages.LeftNav;

public class MySubjectCatSteps {

    private final DialogContent dc;
    private final LeftNav ln;

    public MySubjectCatSteps(DialogContent dc, LeftNav ln) {
        this.dc = dc;
        this.ln = ln;
    }

    @And("^Click on SubjectCategory$")
    public void clickOnSubjectCategory() {
        ln.clickFunction(ln.getSubjectCategories());
    }

    @And("^Click on addSubjectCategory$")
    public void clickOnAddSubjectCategory() {
        dc.clickFunction(dc.getAddSubjectCategory());

    }

    @And("^Click on MySubjectCat$")
    public void clickOnMySubjectCat() {
        dc.scrollToElement(dc.getMySubjectCat());
        dc.clickFunction(dc.getMySubjectCat());
    }


    @When("^User a Subject Categories name as \"([^\"]*)\" Subject Categories code\"([^\"]*)\"$")
    public void userASubjectCategoriesNameAsSubjectCategoriesCode(String name, String code)  {
        dc.sendKeysFunction(dc.getSubjectCategoriesName(),name);
        dc.sendKeysFunction(dc.getSubjectCategoriesCode(),code);

    }

    @And("^Click on Save Button$")

    public void clickOnSaveButton() {
        dc.clickFunction(dc.getSubjectCategoriesSave());
    }

    @And("^deletion actions \"([^\"]*)\"$")
    public void deletionActions(String subjectCategory){
        dc.sendKeysFunction(dc.getDeleteInputName2(),subjectCategory);
        dc.clickFunction(dc.getDeleteSerch());
        dc.waitUntilListLessThan(By.xpath("//ms-delete-button[@class='ng-star-inserted']//button"),3);
        dc.clickFunction(dc.getDeleteButton());
        dc.clickFunction(dc.getDeleteButton2());
    }

    @And("^Click on SubjectCategorySecond$")
    public void clickOnSubjectCategorySecond() {
        ln.clickFunction(ln.getSubjectCategories());
        ln.waitUntilInVisible(dc.getSubjetText());
    }

    @Then("^User should see error message$")
    public void userShouldSeeErrorMessage() {
        dc.verifyElementContainsText(dc.getErrorMessage(),"because");
    }


}
