package tests;

import Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ConfigReader;
import utils.Driver;

public class LoginTests_PageFactory extends TestBase_For_Login_Page_Factory{


    //PAGE FACTORY
    @Test
    public void negativ() throws InterruptedException {

        LoginJetB_2 loginJetB = new LoginJetB_2();
        loginJetB.enterUsername("dsds");
        loginJetB.enterPassword("dssd");
        loginJetB.clickLoginButton();
        Assert.assertNotEquals( Driver.getDriver().getTitle(), "JetBlue | Airline Tickets, Flights & Airfare: Book Direct - Official Site");
    }
    @Test
    public void positivePagefactory(){

        LoginJetB_2 loginPage = new LoginJetB_2();
        loginPage.enterUsername(ConfigReader.getProperty("username"));
        loginPage.enterPassword(ConfigReader.getProperty("password"));
        loginPage.clickLoginButton();
        System.out.println(Driver.getDriver().getPageSource());
        Assert.assertEquals( Driver.getDriver().getTitle(), "Sign In | JetBlue");//when we do it test webaplication not give permisein to sign in

    }
    @Test
    public void negatovPagefactory2(){

        LoginJetB_2 loginPage = new LoginJetB_2();
        loginPage.enterUsername(ConfigReader.getProperty("username"));
        loginPage.enterPassword("12456");
        loginPage.clickLoginButton();
        Assert.assertNotEquals( Driver.getDriver().getTitle(), "JetBlue | Airline Tickets, Flights & Airfare: Book Direct - Official Site");

    }
    @Test
    public void negatovPagefactory3(){

        LoginJetB_2 loginPage = new LoginJetB_2();
        loginPage.enterUsername("teamb");
        loginPage.enterPassword(ConfigReader.getProperty("password"));
        loginPage.clickLoginButton();
        Assert.assertNotEquals( Driver.getDriver().getTitle(), "JetBlue | Airline Tickets, Flights & Airfare: Book Direct - Official Site");

    }
}