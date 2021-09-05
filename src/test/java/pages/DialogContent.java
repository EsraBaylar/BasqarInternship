package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(id="mat-input-0")
    private WebElement username;

    @FindBy(id="mat-input-1")
    private WebElement password;

    @FindBy(css="button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath = "(//span[contains(text(),'Dashboard')])[2]")
    public WebElement dashboard;

    @FindBy(xpath = "(//button[@class='consent-give'])[1]")
    private WebElement acceptCookies;

    @FindBy(className="svg-inline--fa fa-plus fa-w-12")
    private WebElement Addbutton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeInput;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "(//span[contains(text(),'Subject')])[4]")
    private WebElement Subjectreport;

    @FindBy(xpath = "(//div[@class='ps__rail-y'])[2]")
    private WebElement rightScroll;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement searchNameInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement firstDelete;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteBtn;



    public WebElement getUsername() {
        return username;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getDashboard() {
        return dashboard;
    }

    public WebElement getAddbutton() {
        return Addbutton;
    }

    public WebElement getNameInput() {
        return nameInput;
    }

    public WebElement getCodeInput() {
        return codeInput;
    }

    public WebElement getSaveButton() {
        return saveButton;
    }

    public WebElement getSubjectreport() {
        return Subjectreport;
    }

    public WebElement getAcceptCookies() {
        return acceptCookies;
    }

    public WebElement getfirstDelete() {
        return firstDelete;
    }

    public WebElement getDeleteBtn() {
        return deleteBtn;
    }

    public WebElement getRightScroll() {
        return rightScroll;
    }

    public WebElement getSearchNameInput() {
        return searchNameInput;
    }

    public WebElement getFirstDelete() {
        return firstDelete;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }
}
