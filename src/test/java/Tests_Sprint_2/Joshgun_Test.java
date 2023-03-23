package Tests_Sprint_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestBase;
import utils.Driver;
import utils.SeleniumUtils;

public class Joshgun_Test extends TestBase {

    @Test
    public void test() throws InterruptedException {

        Driver.getDriver().findElement(By.xpath("(//span[contains(text(),'Stays')])[1]")).click();
        Driver.getDriver().findElement(By.xpath("(//span[normalize-space()='Unlock deals'])[1]")).click();
        SeleniumUtils.switchToFrame("pop-frame07194696063100284");
        SeleniumUtils.waitFor(5);
        WebElement element = Driver.getDriver().findElement(By.xpath("//a[.='Accept All Cookies']"));
        SeleniumUtils.jsClick(element);


        Assert.assertEquals(Driver.getDriver().getTitle(),"Paisy");
//        WebElement element1 = Driver.getDriver().findElement(By.xpath("//*[@class=\"truste_popframe\"]"));
//        Driver.getDriver().switchTo().frame(element1);
//        Driver.getDriver().findElement(By.xpath("//a[@class='call']")).click();

        Driver.getDriver().findElement(By.xpath("(//button[normalize-space()='Vacation Rentals'])[1]")).click();





    }
}
