package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class PackagesInUrl_2 {

    public PackagesInUrl_2(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="(//span[contains(text(),'Packages')])[2]")
    private WebElement pacKage;

    private String getmesage = "Packages";
    public void enterPackage2(){
        this.pacKage.click();
    }

    public String getGetmesage() {
        return getmesage;
    }
}
