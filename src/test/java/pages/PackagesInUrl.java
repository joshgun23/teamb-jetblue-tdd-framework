package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class PackagesInUrl {

    //POM
    private WebElement pacKage =  Driver.getDriver().findElement(By.xpath(("(//span[contains(text(),'Packages')])[2]")));
    private String getmagese = "Packages";
    public void enterPackage(){
        this.pacKage.click();
}

    public String getGetmagese() {
        return getmagese;
    }
}
