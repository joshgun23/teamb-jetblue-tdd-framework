package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Driver;
import utils.SeleniumUtils;

public class TestPackagesJoshgun extends TestBase{




    @Test
    public void pakeges() throws InterruptedException {

        Driver.getDriver().findElement(By.xpath("(//span[contains(text(),'Packages')])[2]")).click();
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("Packages"));
    }
    @Test
    public void travel_Insurance() throws InterruptedException {

        Driver.getDriver().findElement(By.xpath("(//span[contains(text(),'Travel Insurance')])[1]")).click();
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("Travel Insurance"));
    }
    @Test
    public void Paisly() throws InterruptedException {

        Driver.getDriver().findElement(By.xpath("(//span[contains(text(),'Paisly')])[1]")).click();
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("Paisly"));
    }


}
