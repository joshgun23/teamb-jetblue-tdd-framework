package tests_Sprint_2;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tests.TestBase2;
import utils.Driver;
import utils.SeleniumUtils;

public class Flights_OneWay_Trip_C extends TestBase2 {

    @Test(dataProvider = "provideData2")
    public void test(String from, String to, String depart) throws InterruptedException {
        pages_Sprint_2.Flights_C flights = new pages_Sprint_2.Flights_C();
        flights.roundT();
        flights.oneW();
        flights.adoultP();
        flights.adoultI();
        flights.childrenI();
        flights.infantI();
        flights.adoultP();
        flights.getFrom(from);
        flights.getTo(to);
        SeleniumUtils.waitFor(2);
        flights.getDateDepart(depart);
        flights.getSearch();
        Assert.assertEquals(Driver.getDriver().getTitle(), "JetBlue | Select Flights");
    }

    @DataProvider (parallel = true)
    public Object[][] provideData2() {
        return SeleniumUtils.readFromCSV("DATA_ONEWAY_C.csv");
    }
}
