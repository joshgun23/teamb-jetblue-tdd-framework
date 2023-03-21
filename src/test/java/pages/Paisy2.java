package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class Paisy2 {

    public Paisy2(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="(//span[contains(text(),'Paisly')])[1]")
    private WebElement paisy;

    private String getmesage = "Paisly";
    public void enterPaisy2(){
        this.paisy.click();
    }

    public String getGetmesage() {
        return getmesage;
    }
}



