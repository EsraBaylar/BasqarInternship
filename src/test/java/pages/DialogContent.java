package pages;

import utilies.BaseWebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DialogContent extends Parent {

    public DialogContent() {

        PageFactory.initElements(BaseWebDriver.getDriver(), this);
    }

    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginBtn;

    @FindBy(xpath = "(//span[contains(text(),'Dashboard')])[2]")
    private WebElement dashboard;

    @FindBy(css = "div[class='hot-toast-message']")
    private WebElement loginErrorMsg;

    @FindBy(xpath ="//ms-add-button[@table='true']//button")
    public WebElement SubjectsAddButton;


    @FindBy(xpath ="//ms-text-field[@formcontrolname='name']//input")
    public WebElement SubjectsName;

    @FindBy(xpath ="//ms-text-field[@formcontrolname='code']//input")
    public WebElement SubjectsCode;

    @FindBy(xpath ="//div[@id='mat-select-value-7']")
    public WebElement SubjectsCatagory;


    @FindBy(xpath ="(//mat-option//span[@class='mat-option-text'])[3]")
    public WebElement InformationTechnology;

    @FindBy(xpath =" //ms-text-field//input")
    public WebElement deleteInputName2;

    @FindBy(xpath ="//ms-search-button//button")
    public WebElement deleteSerch;


    @FindBy(xpath ="//ms-delete-button[@table='true']//button")
    public WebElement delete1;


    @FindBy(xpath ="//button[@type='submit']//span[@class='mat-button-wrapper']")
    public WebElement delete2;


    @FindBy(xpath ="//ms-save-button//button")
    public WebElement save;

    @FindBy(xpath = "//hot-toast-container//div[contains(text(),'successfully')]")
    private WebElement successMessage;




    public WebElement getUsername() {
        return username;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getLoginBtn() {
        return loginBtn;
    }

    public WebElement getDashboard() {
        return dashboard;
    }

    public WebElement getLoginErrorMsg() {
        return loginErrorMsg;
    }

    public WebElement getSubjectsAddButton() {
        return SubjectsAddButton;
    }

    public WebElement getSubjectsName() {
        return SubjectsName;
    }

    public WebElement getSubjectsCode() {
        return SubjectsCode;
    }

    public WebElement getSubjectsCatagory() {
        return SubjectsCatagory;
    }

    public WebElement getInformationTechnology() {
        return InformationTechnology;
    }

    public WebElement getDeleteInputName2() {
        return deleteInputName2;
    }

    public WebElement getDeleteSerch() {
        return deleteSerch;
    }

    public WebElement getDelete1() {
        return delete1;
    }

    public WebElement getDelete2() {
        return delete2;
    }

    public WebElement getSave() {
        return save;
    }

    public WebElement getSuccessMessage() {
        return successMessage;
    }
}
