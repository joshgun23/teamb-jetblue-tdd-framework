package tests_Sprint_2;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages_Sprint_2.ByRouteTruckerZaur;
import pages_Sprint_2.TruckerByRouteZaur;
import tests.TestBase2;

public class FlightTruckerZaur extends TestBase2 {
    TruckerByRouteZaur truckerByRouteZaur = new TruckerByRouteZaur();
    ByRouteTruckerZaur byflight = new ByRouteTruckerZaur();

    @Test (priority = 1)
    public void truck2() throws InterruptedException{
        truckerByRouteZaur.trackByRoute();
        Assert.assertTrue(truckerByRouteZaur.connection.getText().contains("Connecting flights"),"Test Cases Passed");
    }



    }

