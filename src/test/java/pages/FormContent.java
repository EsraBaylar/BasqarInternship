package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilies.BaseWebDriver;

import java.util.List;

public class FormContent extends Parent {
    public FormContent(){
        PageFactory.initElements(BaseWebDriver.getDriver(), this);
    }

    @FindBy (xpath = "//input[@formcontrolname='description']")//variable
    private WebElement descriptionField;

    public WebElement getDescriptionField() {
        return descriptionField;
    }

    @FindBy (xpath = "//input[@formcontrolname='variable']")
    private WebElement variableField;

    @FindBy (xpath = "//input[@formcontrolname='name']")
    private WebElement nameField;

    @FindBy(xpath ="//*[@data-placeholder='Valid From']")
    private WebElement validFrominput;

    @FindBy(xpath ="//*[@formcontrolname='key']")
    private WebElement keyInput;

    @FindBy(xpath = "(//*[@id='ms-text-field-0'])[1]")
    private WebElement keyInput1;

    @FindBy(xpath = "//input[@data-placeholder='Value']")
    private WebElement valueInput;

    @FindBy(xpath = "(//tbody[@class='mat-calendar-body'])/tr/td")
    private List<WebElement> calendarList;

    @FindBy(xpath = "//*[@id='mat-datepicker-2']/div/mat-month-view/table/tbody/tr[5]/td[4]/div[1]")
    private WebElement date;

    public WebElement getKeyInput1() {
        return keyInput1;
    }

    public WebElement getDate() {
        return date;
    }

    public WebElement getNameField() {
        return nameField;
    }

    public WebElement getValidFrominput() {
        return validFrominput;
    }

    public WebElement getKeyInput() {
        return keyInput;
    }

    public WebElement getValueInput() {
        return valueInput;
    }

    public List<WebElement> getCalendarList() {
        return calendarList;
    }

    public WebElement getVariableField() {
        return variableField;
    }

    @FindBy(xpath = "//mat-select[@formcontrolname='modifierType']")
    private WebElement modifierType;

    public WebElement getModifierType() {
        return modifierType;
    }

    @FindBy(xpath = "//mat-select[@formcontrolname='valueType']")
    private WebElement valueType;

    public WebElement getValueType() {
        return valueType;
    }

    @FindBy(css = "[name='priority']")
    private WebElement priorityField;

    public WebElement getPriorityField() {
        return priorityField;
    }

    @FindBy(css = "[formcontrolname='amount']")
    private WebElement amountField;

    public WebElement getAmountField() {
        return amountField;
    }

    public void actionFillField(String str)
    {
        try {
            Actions actions=new Actions(BaseWebDriver.getDriver());
            Action action= actions.sendKeys(str).build();
            action.perform();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
