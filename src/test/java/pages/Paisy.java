package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class Paisy {

   private WebElement paisy =  Driver.getDriver().findElement(By.xpath("(//span[contains(text(),'Paisly')])[1]"));

    private String getmagese = "Paisly";

    public void enterPaisy(){
        this.paisy.click();
    }

    public String getGetmagese() {
        return getmagese;
    }
}


