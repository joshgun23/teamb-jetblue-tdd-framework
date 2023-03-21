package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class TrueBlueButton2 {

    public TrueBlueButton2(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="(//span[@class='dn db-l'])[1]")
    private WebElement trueB;

    private String getmesage = "Sign up for TrueBlue";
    public void enterTrue2(){
        this.trueB.click();
    }

    public String getGetmesage() {
        return getmesage;
    }
}



