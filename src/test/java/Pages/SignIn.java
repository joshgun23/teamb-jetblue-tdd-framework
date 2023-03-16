package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class SignIn {

   private WebElement signIn =  Driver.getDriver().findElement(By.xpath("(//span[@data-qaid='Sign in'])[1]"));

    public void enterSignIn(){
        this.signIn.click();
    }

}


