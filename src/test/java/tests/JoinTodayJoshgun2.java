package tests;

import pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Driver;

public class JoinTodayJoshgun2 extends TestBase2{



     //POM
    @Test
    public void join1() throws InterruptedException {
        TrueBlueButton trueBlueButton = new TrueBlueButton();
        trueBlueButton.enterTrue();
        Assert.assertTrue(Driver.getDriver().getPageSource().contains(trueBlueButton.getGetmagese()));

        JoinToday joinToday = new JoinToday();
        joinToday.enterJoin();
        Assert.assertEquals(Driver.getDriver().getTitle(),joinToday.getGetmagese());
    }

    //PAGE FACTORY
    @Test
    public void join2() throws InterruptedException {

        TrueBlueButton2 trueBlueButton2 = new TrueBlueButton2();
        trueBlueButton2.enterTrue2();
        Assert.assertTrue(Driver.getDriver().getPageSource().contains(trueBlueButton2.getGetmesage()));

        JoinToday2 joinToday = new JoinToday2();
        joinToday.enterJoin2();
        Assert.assertEquals(Driver.getDriver().getTitle(),joinToday.getGetmesage());


    }

}
