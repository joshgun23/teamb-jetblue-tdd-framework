package tests;

import Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Driver;

public class EmailJoshgun2 extends TestBase{



     //POM
    @Test
    public void join1() throws InterruptedException {
        TrueBlueButton trueBlueButton = new TrueBlueButton();
        trueBlueButton.enterTrue();
        Assert.assertTrue(Driver.getDriver().getPageSource().contains(trueBlueButton.getGetmagese()));

        JoinToday joinToday = new JoinToday();
        joinToday.enterJoin();
        Assert.assertEquals(Driver.getDriver().getTitle(),joinToday.getGetmagese());

        Emailput emailput = new Emailput();
        emailput.getEmeailP();
        emailput.nextB();
        Assert.assertTrue(Driver.getDriver().getPageSource().contains(emailput.getGetmagese()));
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

        Emailp2 emailp2 = new Emailp2();
        emailp2.getEmeailP2();
        emailp2.nextB();
        Assert.assertTrue(Driver.getDriver().getPageSource().contains(emailp2.getGetmagese()));


    }

}
