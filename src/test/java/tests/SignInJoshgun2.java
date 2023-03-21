package tests;

import pages.SignIn;
import pages.SignIn2;
import pages.TrueBlueButton;
import pages.TrueBlueButton2;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Driver;

public class SignInJoshgun2 extends TestBase{



     //POM
    @Test
    public void true1() throws InterruptedException {

        TrueBlueButton trueBlueButton = new TrueBlueButton();
        trueBlueButton.enterTrue();
        Assert.assertTrue(Driver.getDriver().getPageSource().contains(trueBlueButton.getGetmagese()));

        SignIn signIn = new SignIn();
        signIn.enterSignIn();
        System.out.println();
        Assert.assertEquals(Driver.getDriver().getTitle(),"JetBlue | Airline Tickets, Flights & Airfare: Book Direct - Official Site");
    }

    //PAGE FACTORY
    @Test
    public void true2() throws InterruptedException {

        TrueBlueButton2 trueBlueButton2 = new TrueBlueButton2();
        trueBlueButton2.enterTrue2();
        Assert.assertTrue(Driver.getDriver().getPageSource().contains(trueBlueButton2.getGetmesage()));

        SignIn2 signIn2 = new SignIn2();
        signIn2.entersignIn2();
        Assert.assertEquals(Driver.getDriver().getTitle(),"JetBlue | Airline Tickets, Flights & Airfare: Book Direct - Official Site");



    }

}
