package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class Travel_Insurance {

   private WebElement travel =  Driver.getDriver().findElement(By.xpath("(//span[contains(text(),'Travel Insurance')])[1]"));

    private String getmagese = "Travel Insurance";

    public void enterTravel(){
        this.travel.click();
    }

    public String getGetmagese() {
        return getmagese;
    }
}


