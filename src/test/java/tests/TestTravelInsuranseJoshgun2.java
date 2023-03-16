package tests;

import Pages.PackagesInUrl;
import Pages.PackagesInUrl_2;
import Pages.Travel_Insurance;
import Pages.Travel_Insurance2;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Driver;

public class TestTravelInsuranseJoshgun2 extends TestBase{



     //POM
    @Test
    public void insuranse() throws InterruptedException {

        Travel_Insurance travel = new Travel_Insurance();
        travel.enterTravel();
        Assert.assertTrue(Driver.getDriver().getPageSource().contains(travel.getGetmagese()));
    }

    //PAGE FACTORY
    @Test
    public void insuranse2() throws InterruptedException {

        Travel_Insurance2 travel_insurance2 = new Travel_Insurance2();
        travel_insurance2.enterTravel2();
        Assert.assertTrue(Driver.getDriver().getPageSource().contains(travel_insurance2.getGetmesage()));
    }

}
