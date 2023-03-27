package Tests_Sprint_2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages_Sprint_2.ByRouteTruckerZaur;
import pages_Sprint_2.TruckerByRouteZaur;
import tests.TestBase2;
import utils.Driver;

import java.time.Duration;

public class ByRouteZaur extends TestBase2 {
    TruckerByRouteZaur truckerByRouteZaur = new TruckerByRouteZaur();
    ByRouteTruckerZaur byflight = new ByRouteTruckerZaur();


    @Test
    public void  byFlightNumber() throws InterruptedException{
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        truckerByRouteZaur.trackByRoute();
        String flightext =truckerByRouteZaur.textflight.getText();
        String flighttext1 =  flightext.substring(14,18);
        System.out.println(flighttext1);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,-350)", "");
        byflight.byFlightNumber.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(byflight.getFlightNumber).click(byflight.getFlightNumber).sendKeys(flighttext1).perform();
        truckerByRouteZaur.status.click();
        Assert.assertTrue(byflight.directflight.getText().contains("Direct flights"),"Test Cases Failed");


    }
}