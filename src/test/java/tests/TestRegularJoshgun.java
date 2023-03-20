package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Driver;

public class TestRegularJoshgun extends TestBase{




    @Test
    public void pakeges() throws InterruptedException {

        Driver.getDriver().findElement(By.xpath("(//span[@class='dn db-l'])[1]")).click();
        System.out.println(Driver.getDriver().findElement(By.xpath("(//h3[normalize-space()='Sign up for TrueBlue'])[1]")).getText());
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("Sign up for TrueBlue"));

        Driver.getDriver().findElement(By.xpath("(//a[@class='pointer avenir b no-underline t-med-bg t-out-hover w-100 w-auto-ns tc border-box inline-flex align-items-center justify-center jb-button-primary jb-button-medium b--none bg-royal-blue br-rounded-2 s-body hover-white white w-max-ns ng-star-inserted'])[1]")).click();
        System.out.println(Driver.getDriver().getTitle());
        Assert.assertEquals(Driver.getDriver().getTitle(),"JetBlue");


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
