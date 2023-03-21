package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class LoginJetB {

    private WebElement username =  Driver.getDriver().findElement(By.xpath("(//input[@type='email'])[1]"));
    private WebElement password =  Driver.getDriver().findElement(By.xpath("(//input[@type='password'])[1]"));
    private WebElement button =  Driver.getDriver().findElement(By.xpath("(//button[@role='button'])[1]"));



    public void enterUsername(String username){
        this.username.sendKeys(username);
    }

    public void enterPassword(String password){
        this.password.sendKeys(password);
    }

    public void clickLoginButton(){
        button.click();
    }
}

