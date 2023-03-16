package tests;

import Pages.PackagesInUrl;
import Pages.PackagesInUrl_2;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Driver;

public class TestPackagesJoshgun2 extends TestBase{



     //POM
    @Test
    public void pakeges() throws InterruptedException {

        PackagesInUrl packages = new PackagesInUrl();
        packages.enterPackage();
        Assert.assertTrue(Driver.getDriver().getPageSource().contains(packages.getGetmagese()));
    }

    //PAGE FACTORY
    @Test
    public void pakeges2() throws InterruptedException {

        PackagesInUrl_2 packagesInUrl_2 = new PackagesInUrl_2();
        packagesInUrl_2.enterPackage2();
        Assert.assertTrue(Driver.getDriver().getPageSource().contains(packagesInUrl_2.getGetmesage()));
    }

}
