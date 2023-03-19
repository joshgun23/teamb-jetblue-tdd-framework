package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class Policies_Page {

    public Policies_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText="Safety")
    public WebElement safety;

    @FindBy(linkText="Legal")
    public WebElement legal;
    @FindBy(linkText="Web Accessibility")
    public WebElement webaccess;

    @FindBy(linkText="Contract of Carriage")
    public WebElement carriage;
    @FindBy(linkText="Contract of Carriage - Français")
    public WebElement carriagefrancias;

    @FindBy(linkText="Tarmac Delay Plan")
    public WebElement tarmac;

    @FindBy(linkText="Customer Service Plan")
    public WebElement customer;



    @FindBy(linkText="Privacy")
    public WebElement privacy;

    @FindBy(linkText = "Human Trafficking")
    public WebElement humantrafficking;

    @FindBy(linkText = "Optional Services and Fees")
    public WebElement optional;

}
