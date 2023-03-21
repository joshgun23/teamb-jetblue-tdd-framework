package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class Emailput {

   private WebElement emeailP =  Driver.getDriver().findElement(By.xpath("(//input[@id='email'])[1]"));
    private WebElement nextB =  Driver.getDriver().findElement(By.xpath("(//button[normalize-space()='Next'])[1]"));
    private String getmagese = "Sign Up";

    public void getEmeailP() {
        this.emeailP.sendKeys("Coshgun.ismayilov231985@gmail.com");
    }

    public void nextB(){
        this.nextB.click();
    }

    public String getGetmagese() {
        return getmagese;
    }
}


