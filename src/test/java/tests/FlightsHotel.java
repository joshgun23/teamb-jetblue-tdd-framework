package tests;

import Pages.JetBlueHomePage;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Driver;
import utils.SeleniumUtils;


public class FlightsHotel extends TestBase {

    @Test

    public void verifyFlightsHotelButton() throws InterruptedException {
        //Verifying that Flights + Hotel button is available
        JetBlueHomePage jetBlueHomePage = new JetBlueHomePage();
        Thread.sleep(1000);
        jetBlueHomePage.getFlightsHotelButton().click();
        Assert.assertTrue(jetBlueHomePage.getFlightsHotelButton().isDisplayed());

    }

    @Test (priority = 2,enabled = false)

    public void verifyOriginAndDestinationFields() throws InterruptedException {

        JetBlueHomePage jetBlueHomePage = new JetBlueHomePage();
        jetBlueHomePage.getFlightsHotelButton().click();
        jetBlueHomePage.getFromOriginButton().click();
        String fromAirport = "Miami";
        String toAirport = "Las Vegas";
        jetBlueHomePage.getFromOriginButton().sendKeys(fromAirport);
        jetBlueHomePage.getFromOriginButton().sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        jetBlueHomePage.getToDestinationButton().click();
        jetBlueHomePage.getToDestinationButton().sendKeys(toAirport);
        jetBlueHomePage.getToDestinationButton().sendKeys(Keys.ENTER);
        // Verifying that the "From" and "To" fields have the correct values
        Thread.sleep(1000);
        String fromFieldValue = jetBlueHomePage.getFromOriginButton().getAttribute("value");
        String toFieldValue = jetBlueHomePage.getToDestinationButton().getAttribute("value");
        if (fromFieldValue.contains(fromAirport) && toFieldValue.contains(toAirport)) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
        }
    }

    @Test (priority = 3,enabled = false)

    public void verifyDepartureAndReturnDateFields() throws InterruptedException {

        JetBlueHomePage jetBlueHomePage = new JetBlueHomePage();
        jetBlueHomePage.getFlightsHotelButton().click();
        jetBlueHomePage.getDepartDateButton().click();
        Thread.sleep(1000);
        String departureDate = "07/07/2023";
        String returnDate = "07/17/2023";
        jetBlueHomePage.getDepartDateButton().sendKeys(departureDate, Keys.ENTER);
        Thread.sleep(1000);
        jetBlueHomePage.getReturnDateButton().click();
        jetBlueHomePage.getReturnDateButton().sendKeys(returnDate, Keys.ENTER);

    }

    @Test

    public void verifyAddingRoom() throws InterruptedException {

        JetBlueHomePage jetBlueHomePage = new JetBlueHomePage();
        jetBlueHomePage.getFlightsHotelButton().click();
        Thread.sleep(500);
        jetBlueHomePage.getSelectRooms().click();
        jetBlueHomePage.getAddRoom().click();
        Thread.sleep(1000);

    }
    @Test

    public void verifyAddingAdult() throws InterruptedException {

        JetBlueHomePage jetBlueHomePage = new JetBlueHomePage();
        jetBlueHomePage.getFlightsHotelButton().click();
        Thread.sleep(500);
        jetBlueHomePage.getSelectRooms().click();
        jetBlueHomePage.getAddAdult().click();
        Thread.sleep(1000);

    }
    @Test (priority = 1,enabled = false)

    public void verifySearchButton() throws InterruptedException {

        JetBlueHomePage jetBlueHomePage = new JetBlueHomePage();
        jetBlueHomePage.getFlightsHotelButton().click();
        String fromAirport = "Miami";
        String toAirport = "Las Vegas";
        Thread.sleep(1000);
        jetBlueHomePage.getFromOriginButton().sendKeys(fromAirport, Keys.TAB);
        jetBlueHomePage.getToDestinationButton().sendKeys(toAirport, Keys.TAB);
        String departureDate = "07/07/2023";
        String returnDate = "07/17/2023";
        jetBlueHomePage.getDepartDateButton().sendKeys(departureDate, Keys.TAB);
        jetBlueHomePage.getReturnDateButton().sendKeys(returnDate, Keys.ENTER);
        jetBlueHomePage.getSearchFlightsHotelButton().click();
        SeleniumUtils.waitFor(10);
        Assert.assertEquals( Driver.getDriver().getTitle(), "JetBlue Vacations - Loading");

    }
}

