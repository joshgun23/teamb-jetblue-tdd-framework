package tests_Sprint_2;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tests.TestBase2;
import utils.Driver;
import utils.SeleniumUtils;

public class Flights_Round_Trip_C extends TestBase2 {

    @Test(dataProvider = "provideData1")
    public void test(String from, String to, String depart, String reTurn) throws InterruptedException {
        pages_Sprint_2.Flights_C flights = new pages_Sprint_2.Flights_C();
        flights.getFrom(from);
        flights.getTo(to);
        SeleniumUtils.waitFor(2);
        flights.getDateDepart(depart);
        flights.getDateReturn(reTurn);
        flights.getSearch();
        Assert.assertEquals(Driver.getDriver().getTitle(), "JetBlue | Select Flights");
    }

    @DataProvider
    public Object[][] provideData1() {
        return SeleniumUtils.readFromCSV("DATA_C2.csv");
    }
}
