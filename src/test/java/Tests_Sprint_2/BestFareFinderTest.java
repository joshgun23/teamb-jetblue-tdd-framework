package Tests_Sprint_2;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages_Sprint_2.BestFareFinderPage;
import tests.TestBase2;
import utils.Driver;
import utils.SeleniumUtils;


public class BestFareFinderTest extends TestBase2 {

    @Test
    public void fareFinder ()  {
        BestFareFinderPage bestFareFinderPage = new BestFareFinderPage();
        bestFareFinderPage.clickOnBook();
        bestFareFinderPage.clickOnBestFareFinder();
        Assert.assertEquals(Driver.getDriver().getTitle(),"Best Fare Finder | JetBlue");
    }
    @Test (dataProvider = "airportCodeProvider")
    public void testFlightFrom (String airportCode) {
        BestFareFinderPage bestFareFinderPage = new BestFareFinderPage();
        bestFareFinderPage.clickOnBook();
        bestFareFinderPage.clickOnBestFareFinder();
        new BestFareFinderPage().flightFrom(airportCode);
        Assert.assertTrue(Driver.getDriver().getPageSource().contains(airportCode));
    }
    @Test (dataProvider = "airportCodeProvider")
    public void testFlightTo (String airportCode) {
        BestFareFinderPage bestFareFinderPage = new BestFareFinderPage();
        bestFareFinderPage.clickOnBook();
        bestFareFinderPage.clickOnBestFareFinder();
        new BestFareFinderPage().flightTo(airportCode);
        Assert.assertTrue(Driver.getDriver().getPageSource().contains(airportCode));

    }
    @DataProvider
    public Object[][] airportCodeProvider() {
        return SeleniumUtils.readFromCSV("DataAirport.csv");
    }

    @Test (dataProvider = "airportCode")
        public void testFlightWithSameFromAndTo (String airportCode1, String airportCode2) {
        BestFareFinderPage bestFareFinderPage = new BestFareFinderPage();
        bestFareFinderPage.clickOnBook();
        bestFareFinderPage.clickOnBestFareFinder();
        new BestFareFinderPage().flightFromExplore(airportCode1);
        new BestFareFinderPage().flightTo(airportCode2);
        Assert.assertEquals(bestFareFinderPage.getErrorMessage().getText(), "Uh-oh. It doesn't look like we fly between those two locations. Please try another city nearby." );
    }

    @DataProvider
    public Object[][] airportCode() {
        return new Object[][] {
                {"LAX", "LAX"}
        } ;
    }

    @Test (dataProvider = "destination")
    public void testExploreFares (String city1, String city2) {
        BestFareFinderPage bestFareFinderPage = new BestFareFinderPage();
        bestFareFinderPage.clickOnBook();
        bestFareFinderPage.clickOnBestFareFinder();
        new BestFareFinderPage().flightFrom(city1);
        new BestFareFinderPage().flightToExplore(city2);
        new BestFareFinderPage().clickOnExploreFares();
        Assert.assertTrue(bestFareFinderPage.getDepartureDate().isDisplayed());
    }
    @DataProvider
    public Object[][] destination() {
        return new Object[][] {
                {"SFO", "CDG"}
        } ;
    }




}



