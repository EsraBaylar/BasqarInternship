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
    private WebElement SubjectsAddButton;

    @FindBy(xpath ="//ms-text-field[@formcontrolname='name']//input")
    private WebElement SubjectsName;

    @FindBy(xpath ="//ms-text-field[@formcontrolname='code']//input")
    private WebElement SubjectsCode;

    @FindBy(xpath ="(//mat-select//span)[4]")
    private WebElement SubjectsCatagory;


    @FindBy(xpath ="(//mat-option//span[@class='mat-option-text'])[3]")
    private WebElement InformationTechnology;

    @FindBy(xpath =" //ms-text-field//input")
    private WebElement deleteInputName2;

    @FindBy(xpath ="//ms-search-button//button")
    private WebElement deleteSearch;


    @FindBy(xpath ="//ms-delete-button[@table='true']//button")
    private WebElement delete1;


    @FindBy(xpath ="//button[@type='submit']//span[@class='mat-button-wrapper']")
    private WebElement delete2;

    @FindBy(xpath ="(//span[@class='mat-button-wrapper'])[18]")
    private WebElement deleteButton2;

    @FindBy(xpath ="//ms-save-button//button")
    private WebElement save;

    @FindBy(xpath = "//hot-toast-container//div[contains(text(),'successfully')]")
    private WebElement successMessage;


    @FindBy(xpath = "//ms-add-button[@tooltip='SUBJECT_CATEGORIES.TITLE.ADD']")
    private WebElement addSubjectCategory;

    @FindBy(xpath = "( //ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input)[2]")
    private WebElement SubjectCategoriesName;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement SubjectCategoriesCode;

    @FindBy(xpath = "(//ms-save-button//button//span)[2]")
    private WebElement SubjectCategoriesSave;

    @FindBy(xpath = "(//mat-option//span)[7]")
    private WebElement  MySubjectCat;

    @FindBy(xpath ="//ms-delete-button[@class='ng-star-inserted']//button")
    private WebElement deleteButton;

    @FindBy(xpath = "//div[contains(text(),'Subject Category')]")
    private WebElement subjetText;

    @FindBy(xpath = "//div[contains(text(),'because')]")
    private WebElement errorMessage;


    @FindBy(xpath = "// ms-add-button[contains(@tooltip,'POSITIONS.TITLE.ADD')]")
    private WebElement addButtonSalary;

    @FindBy(xpath = "(//input[@id='ms-text-field-0'])[1]")
    private WebElement newSalary;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(css= "input#mat-input-2")
    private WebElement searchInput;

    @FindBy(xpath = "// ms-add-button[contains(@tooltip,'EMPLOYEE_POSITION.TITLE.ADD')]")
    private WebElement addpositionsClick;

    @FindBy(xpath = "(//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input)[2]")
    private WebElement inputPositionsName;

    @FindBy(xpath = "(//ms-text-field[@placeholder='GENERAL.FIELD.SHORTNAME']//input)[2]")
    private WebElement inputPositionsShortName;


    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement inputPositionsNameSearch;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.SHORTNAME']//input")
    private WebElement inputPositionsShortNameSearch;


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
        return deleteSearch;
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

    public WebElement getAddSubjectCategory() {
        return addSubjectCategory;
    }

    public WebElement getSubjectCategoriesName() {
        return SubjectCategoriesName;
    }

    public WebElement getSubjectCategoriesCode() {
        return SubjectCategoriesCode;
    }

    public WebElement getSubjectCategoriesSave() {
        return SubjectCategoriesSave;
    }

    public WebElement getMySubjectCat() {
        return MySubjectCat;
    }

    public WebElement getDeleteButton() {
        return deleteButton;
    }

    public WebElement getDeleteButton2() {
        return deleteButton2;
    }

    public WebElement getSubjetText() {
        return subjetText;
    }

    public WebElement getErrorMessage() {
        return errorMessage;
    }


    public WebElement getDeleteSearch() {
        return deleteSearch;
    }

    public WebElement getAddButtonSalary() {
        return addButtonSalary;
    }

    public WebElement getNewSalary() {
        return newSalary;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getSearchInput() {
        return searchInput;
    }

    public WebElement getAddpositionsClick() {
        return addpositionsClick;
    }

    public WebElement getInputPositionsName() {
        return inputPositionsName;
    }

    public WebElement getInputPositionsShortName() {
        return inputPositionsShortName;
    }

    public WebElement getInputPositionsNameSearch() {
        return inputPositionsNameSearch;
    }

    public WebElement getInputPositionsShortNameSearch() {
        return inputPositionsShortNameSearch;
    }
}
