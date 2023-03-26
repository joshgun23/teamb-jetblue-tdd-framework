package Tests_Sprint_2;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages_Sprint_2.BestFareFinderPage;
import tests.TestBase2;
import utils.Driver;


public class BestFareFinderTest extends TestBase2 {

    @Test
    public void fareFinderButtonTest() throws InterruptedException {

        BestFareFinderPage bestFareFinderPage = new BestFareFinderPage();
        bestFareFinderPage.clickOnBook();
        bestFareFinderPage.clickOnBestFareFinder();
        Assert.assertEquals(Driver.getDriver().getTitle(),"Best Fare Finder | JetBlue");
    }

    @Test
    public void
}
