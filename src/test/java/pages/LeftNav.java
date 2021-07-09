package pages;

import utilies.BaseWebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {

    public LeftNav() {

        PageFactory.initElements(BaseWebDriver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setupOne;

    @FindBy (linkText = "Human Resources")
    private WebElement hrButton;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement setupHRbutton;

    @FindBy(xpath = "(//span[text()='Salary Modifiers'])[1]")
    private WebElement salaryModifiers;


    public WebElement getSalaryModifiers() {
        return salaryModifiers;
    }

    public WebElement getHrButton() {
        return hrButton;
    }

    public WebElement getSetupHRbutton() {
        return setupHRbutton;
    }


}
