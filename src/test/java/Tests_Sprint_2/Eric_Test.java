package Tests_Sprint_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestBase2;
import utils.Driver;
import utils.SeleniumUtils;

import static utils.Driver.getDriver;

public class Eric_Test extends TestBase2 {

    public static void switchToWindow(String targetTitle) {

        String origin = Driver.getDriver().getWindowHandle();
        for (String handle : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window( handle );
            if (Driver.getDriver().getTitle().equals( targetTitle )) {
                return;
            }
        }
        Driver.getDriver().switchTo().window( origin );
    }

    @Test
    public void FlightsCruiseSectionVisible() {

        WebElement getFlightsCruiseSection = getDriver().findElement( By.xpath( "//span[text()='Flights + Cruise']" ) );
        Assert.assertTrue( getFlightsCruiseSection.isDisplayed(), "'Flights + Cruise' section is visible" );

    }

    @Test
    public void FlightsCruiseclickable() {
        WebElement getFlightsCruiseSection = getDriver().findElement( By.xpath( "//span[text()='Flights + Cruise']" ) );
        getFlightsCruiseSection.click();

    }

    @Test
    public void CruiseLink() {

        WebElement getFlightsCruiseSection = getDriver().findElement( By.xpath( "//span[text()='Flights + Cruise']" ) );
        getFlightsCruiseSection.click();


        WebElement arrivalCityInput = getDriver().findElement( By.xpath( "//span[text()='Search flights + cruise']" ) );
        arrivalCityInput.click();

        SeleniumUtils.waitFor( 2 );

        //    WebElement elementCruise = getDriver().findElement(By.xpath("//*[@class=jtpsdk-popup-modal-content]"));
        //  getDriver().switchTo().frame(elementCruise);
        //  WebElement getCookies = getDriver().findElement(By.xpath("//a[@class='jtpmainbtn mv3']"));
        //  getCookies.click();

        WebElement elementCruise1 = getDriver().findElement( By.xpath( "(//span[normalize-space()='Search flights + cruise'])[1]" ) );
        elementCruise1.click();
        SeleniumUtils.waitFor( 2 );

        SeleniumUtils.switchToWindow( "Fligths + Cruise | JetBlue Vacations " );
        SeleniumUtils.waitFor( 2 );


        WebElement arrivalCityInput3 = getDriver().findElement( By.xpath( "//span[text()='Search flights + cruise']" ) );
        arrivalCityInput3.click();
        SeleniumUtils.waitFor( 2);


        //  WebElement arrivalDateInput4 = getDriver().findElement( By.linkText( "Jun 2023" ));
        //  arrivalDateInput4.click();
        // WebElement findCruiseButton = getDriver().findElement( By.id( "jtp-booker-cruise-submit" ));
         //findCruiseButton.click();



    }
}