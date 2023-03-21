package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class SignIn2 {

    public SignIn2(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="(//span[@data-qaid='Sign in'])[1]")
    private WebElement signIn;

    public void entersignIn2(){
        this.signIn.click();
    }

}



