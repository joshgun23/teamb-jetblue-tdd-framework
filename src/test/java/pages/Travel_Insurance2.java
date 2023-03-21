package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class Travel_Insurance2 {

    public Travel_Insurance2(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="(//span[contains(text(),'Travel Insurance')])[1]")
    private WebElement traVel;

    private String getmesage = "Packages";
    public void enterTravel2(){
        this.traVel.click();
    }

    public String getGetmesage() {
        return getmesage;
    }
}



