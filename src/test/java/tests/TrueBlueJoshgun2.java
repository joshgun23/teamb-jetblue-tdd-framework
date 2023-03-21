package tests;

import pages.TrueBlueButton;
import pages.TrueBlueButton2;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Driver;

public class TrueBlueJoshgun2 extends TestBase{



     //POM
    @Test
    public void true1() throws InterruptedException {

        TrueBlueButton trueBlueButton = new TrueBlueButton();
        trueBlueButton.enterTrue();
        Assert.assertTrue(Driver.getDriver().getPageSource().contains(trueBlueButton.getGetmagese()));
    }

    //PAGE FACTORY
    @Test
    public void true2() throws InterruptedException {

        TrueBlueButton2 trueBlueButton2 = new TrueBlueButton2();
        trueBlueButton2.enterTrue2();
        Assert.assertTrue(Driver.getDriver().getPageSource().contains(trueBlueButton2.getGetmesage()));
    }

}
