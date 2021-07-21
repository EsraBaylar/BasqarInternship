package pages;

import utilies.BaseWebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DialogContent extends Parent {

    public DialogContent() {

        PageFactory.initElements(BaseWebDriver.getDriver(), this);
    }

    @FindBy(css = "input[id=mat-input-0]")
    private WebElement username;

    @FindBy(css = "input[id=mat-input-1]")
    private WebElement password;

    @FindBy(xpath = "//button[@aria-label='LOGIN']")
    private WebElement loginbutton;

    @FindBy(xpath = "//span[contains(text(),=' Dashboard')]")
    private WebElement successmessage;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@id='ms-text-field-4']")
    private WebElement description;

    @FindBy(xpath = "//mat-form-field/div/div/div/input[@id='mat-input-6']")
    private WebElement budgetInfoStartDate;

    @FindBy(xpath = "//mat-form-field/div/div/div/input[@id='mat-input-7']")
    private WebElement budgetInfoEndDate;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    public WebElement getAddButton() {
        return addButton;
    }

    public WebElement getDescription() {
        return description;
    }

    public WebElement getBudgetInfoStartDate() {
        return budgetInfoStartDate;
    }

    public WebElement getBudgetInfoEndDate() {
        return budgetInfoEndDate;
    }

    public WebElement getSaveButton() {
        return saveButton;
    }

    public WebElement getSuccessmessage() {
        return successmessage;
    }

    public WebElement getUsername() {
        return username;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getLoginbutton() {
        return loginbutton;
    }
}
