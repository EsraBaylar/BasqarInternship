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

    @FindBy(xpath="//span[text()='Education']")
    private WebElement education;

    @FindBy(xpath="(//span[text()='Setup'])[5]")
    private WebElement educationSetup;

    @FindBy(xpath="//span[text()='Subjects']")
    private WebElement subjects;

    @FindBy(xpath="//span[text()='Subject Categories']")
    private WebElement subjectCategories;

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement HumanRsrcClick;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement setupClick;

    @FindBy(xpath = "//span[text()='Position Salary']")
    private WebElement positionSalary;

    @FindBy(xpath = "(//span[contains(text(),'Positions')])[1]")
    private WebElement positionsClick;

    @FindBy(xpath = "//span[text()='Budget']")
    private WebElement budget;

    @FindBy(xpath = "(//span[text()='Setup'])[6]")
    private WebElement setupTwo;

    @FindBy(xpath = "//span[text()='Budget Groups']")
    private WebElement budgetGroups;

    @FindBy(xpath = "//span[text()='Cost Centers']")
    private WebElement CostCenters;

    public WebElement getBudget() {
        return budget;
    }

    public WebElement getSetupTwo() {
        return setupTwo;
    }

    public WebElement getBudgetGroups() {
        return budgetGroups;
    }

    public WebElement getSetupOne() {
        return setupOne;
    }

    public WebElement getEducation() {
        return education;
    }

    public WebElement getEducationSetup() {
        return educationSetup;
    }

    public WebElement getSubjects() {
        return subjects;
    }

    public WebElement getSubjectCategories() {
        return subjectCategories;
    }

    public WebElement getHumanRsrcClick() {
        return HumanRsrcClick;
    }
    public WebElement getSetupClick() {
        return setupClick;
    }

    public WebElement getPositionSalary() {
        return positionSalary;
    }

    public WebElement getPositionsClick() {
        return positionsClick;
    }

    @FindBy(xpath = "(//span[text()='Salary Constants'])[1]")
    private WebElement salaryConstants;



    public WebElement getSalaryConstants() {
        return salaryConstants;
    }

    public WebElement getSalaryModifiers() {
        return salaryModifiers;
    }

    public WebElement getHrButton() {
        return hrButton;
    }

    public WebElement getSetupHRbutton() {
        return setupHRbutton;
    }

    public WebElement getCostCenters() {
        return CostCenters;
    }
}
