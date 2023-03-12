package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ConfigReader;
import utils.Driver;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.Properties;

public class TestBase {
    @BeforeMethod (alwaysRun = true)
    public void setUpEachMethod() throws IOException, InterruptedException {

        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        WebElement element1 = Driver.getDriver().findElement(By.xpath("//*[@class=\"truste_popframe\"]"));
        Driver.getDriver().switchTo().frame(element1);
        Driver.getDriver().findElement(By.xpath("//a[@class='call']")).click();
        Thread.sleep(2000);
    }

    @AfterMethod (alwaysRun = true)
    public void tearDownMethod(){

        Driver.quitDriver();
    }


}

