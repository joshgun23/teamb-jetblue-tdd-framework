package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.ConfigReader;
import utils.Driver;
import utils.SeleniumUtils;


import java.io.IOException;
import java.time.Duration;

import static org.testng.Assert.assertTrue;


public class knowUs {


    @Test
    public void testKnowUsLinkInMainNavigationMenu() {




            Driver.getDriver().manage().window().maximize();
            Driver.getDriver().manage().timeouts().implicitlyWait( Duration.ofSeconds(10));
            Driver.getDriver().get( ConfigReader.getProperty("url"));
            WebElement element1 = Driver.getDriver().findElement(By.xpath("//*[@class=\"truste_popframe\"]"));
            Driver.getDriver().switchTo().frame(element1);
            Driver.getDriver().findElement(By.xpath("//a[@class='call']")).click();
            SeleniumUtils.waitFor(2);


        WebElement knowUsLink =  Driver.getDriver().findElement( By.className( "body b core-blue mb0" ) );
        knowUsLink.click();
        WebElement knowUsSection =  Driver.getDriver().findElement( By.id( "Our Company" ) );
        assertTrue( knowUsSection.isDisplayed() );
        assertTrue(  Driver.getDriver().getCurrentUrl().contains( " Our Brands " ) );
        Driver.quitDriver();
    }

}
