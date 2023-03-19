package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class TrueBlueButton {

   private WebElement trueB =  Driver.getDriver().findElement(By.xpath("(//span[@class='dn db-l'])[1]"));

    private String getmagese = "Sign up for TrueBlue";

    public void enterTrue(){
        this.trueB.click();
    }

    public String getGetmagese() {
        return getmagese;
    }
}


