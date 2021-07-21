package pages;

import utilies.BaseWebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {

    public LeftNav() {

        PageFactory.initElements(BaseWebDriver.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Budget']")
    private WebElement budget;

    @FindBy(xpath = "(//span[text()='Setup'])[6]")
    private WebElement setupTwo;

    @FindBy(xpath = "//span[text()='Budget Groups']")
    private WebElement budgetGroups;


    public WebElement getBudget() {
        return budget;
    }

    public WebElement getSetupTwo() {
        return setupTwo;
    }

    public WebElement getBudgetGroups() {
        return budgetGroups;
    }
}
