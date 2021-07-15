package stepDefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DialogContent;
import pages.LeftNav;
import utilies.BaseWebDriver;

public class MySubjectCatSteps {
     LeftNav ln=new LeftNav();
     DialogContent dc=new DialogContent();


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

    @And("^Click on Save Buttonn$")

    public void clickOnSaveButtonn() {
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
        WebDriverWait wait=new WebDriverWait(BaseWebDriver.getDriver(),10);
        wait.until(ExpectedConditions.invisibilityOf(dc.getSubjetText()));
    }

    @Then("^User shoul see error message$")
    public void userShoulSeeErrorMessage() {
        dc.verifyElementContainsText(dc.getErrorMessage(),"because");
    }


}
