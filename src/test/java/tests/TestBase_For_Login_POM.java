package tests;

import pages.SignIn;
import pages.TrueBlueButton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ConfigReader;
import utils.Driver;
import utils.SeleniumUtils;

import java.io.IOException;
import java.time.Duration;

public class TestBase_For_Login_POM {
    @BeforeMethod (alwaysRun = true)
    public void setUpEachMethod() throws IOException, InterruptedException {

        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        WebElement element1 = Driver.getDriver().findElement(By.xpath("//*[@class=\"truste_popframe\"]"));
        Driver.getDriver().switchTo().frame(element1);
        Driver.getDriver().findElement(By.xpath("//a[@class='call']")).click();
        SeleniumUtils.waitFor(2);

        TrueBlueButton trueBlueButton = new TrueBlueButton();
        trueBlueButton.enterTrue();
        Assert.assertTrue(Driver.getDriver().getPageSource().contains(trueBlueButton.getGetmagese()));

        SignIn signIn = new SignIn();
        signIn.enterSignIn();
        System.out.println();
        Assert.assertEquals(Driver.getDriver().getTitle(),"JetBlue | Airline Tickets, Flights & Airfare: Book Direct - Official Site");
        SeleniumUtils.waitFor(2);
    }

    @AfterMethod (alwaysRun = true)
    public void tearDownMethod(){

        Driver.quitDriver();
    }


}

