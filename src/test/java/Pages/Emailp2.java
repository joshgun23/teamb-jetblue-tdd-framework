package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class Emailp2 {

    public Emailp2(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="(//input[@id='email'])[1]")
    private WebElement emailA;

    @FindBy(xpath="(//button[normalize-space()='Next'])[1]")
    private WebElement nextButton;

    private String getmagese = "Sign Up";

    public void getEmeailP2() {
        this.emailA.sendKeys("Coshgun.ismayilov231985@gmail.com");
    }

    public void nextB(){
        this.nextButton.click();
    }

    public String getGetmagese() {
        return getmagese;
    }
}



