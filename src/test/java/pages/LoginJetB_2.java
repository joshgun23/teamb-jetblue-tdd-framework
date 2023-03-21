package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ConfigReader;
import utils.Driver;

public class LoginJetB_2 {

    public LoginJetB_2(){
        PageFactory.initElements(Driver.getDriver(), this); // initializes everything that has @FindBy annotation
    }

    @FindBy(xpath="(//input[@type='email'])[1]")
    private WebElement username;
    @FindBy (xpath="(//input[@type='password'])[1]")
    private WebElement password;
    @FindBy (xpath="(//button[@role='button'])[1]")
    private WebElement button;



    public void enterUsername(String username){
        this.username.sendKeys(username);
    }
    public void enterPassword(String password){
        this.password.sendKeys(password);
    }

    public void clickLoginButton(){
        button.click();
    }


    public void login(){
        this.username.sendKeys(ConfigReader.getProperty("username"));
        this.password.sendKeys(ConfigReader.getProperty("password"));
        this.button.click();

    }

}

