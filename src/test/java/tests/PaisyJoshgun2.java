package tests;

import Pages.Paisy;
import Pages.Paisy2;
import Pages.Travel_Insurance;
import Pages.Travel_Insurance2;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Driver;

public class PaisyJoshgun2 extends TestBase{



     //POM
    @Test
    public void paisy1() throws InterruptedException {

        Paisy paisyJoshgun2 = new Paisy();
        paisyJoshgun2.enterPaisy();
        Assert.assertTrue(Driver.getDriver().getPageSource().contains(paisyJoshgun2.getGetmagese()));
    }

    //PAGE FACTORY
    @Test
    public void paisy2() throws InterruptedException {

        Paisy2 paisy2 = new Paisy2();
        paisy2.enterPaisy2();
        Assert.assertTrue(Driver.getDriver().getPageSource().contains(paisy2.getGetmesage()));
    }

}
