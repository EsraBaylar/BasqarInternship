package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {

    public LeftNav() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(xpath ="//span[text()='Education']" )
    private WebElement Education;


    @FindBy(xpath ="(//span[text()='Setup'])[5]" )
    private WebElement edusetup;


    @FindBy(xpath ="//span[text()='Subject Categories']")
    private WebElement subjectcategories;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    public WebElement getEducation() {
        return Education;
    }

    public WebElement getEdusetup() {
        return edusetup;
    }

    public WebElement getSubjectcategories() {
        return subjectcategories;
    }

    public WebElement getAddButton() {
        return addButton;
    }
}
