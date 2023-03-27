package tests_Sprint_2;

import pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestBase2;
import utils.Driver;

public class EmailJoshgunTest extends TestBase2 {

    //PAGE FACTORY
    @Test
    public void join2() throws InterruptedException {

        TrueBlueButton2 trueBlueButton2 = new TrueBlueButton2();
        trueBlueButton2.enterTrue2();
        Assert.assertTrue(Driver.getDriver().getPageSource().contains(trueBlueButton2.getGetmesage()));

        JoinToday2 joinToday = new JoinToday2();
        joinToday.enterJoin2();
        Assert.assertEquals(Driver.getDriver().getTitle(),joinToday.getGetmesage());

        logger.pass("test7");
        Emailp2 emailp2 = new Emailp2();
        logger.pass("test8");
        emailp2.getEmeailP2();
        logger.pass("test9");
        emailp2.nextB();
        Assert.assertTrue(Driver.getDriver().getPageSource().contains(emailp2.getGetmagese()));


    }


     //POM
    @Test (priority = 2,enabled = false)
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


}
