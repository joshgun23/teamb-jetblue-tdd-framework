package tests;

import pages.*;
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
    @Test (groups = {"smoke"})//(priority = 1)
    public void positivePagefactory(){

        LoginJetB_2 loginPage = new LoginJetB_2();
        loginPage.enterUsername(ConfigReader.getProperty("username"));
        loginPage.enterPassword(ConfigReader.getProperty("password"));
        loginPage.clickLoginButton();
        System.out.println(Driver.getDriver().getPageSource());
        Assert.assertEquals( Driver.getDriver().getTitle(), "Sign In | JetBlue");//when we do it test webaplication not give permisein to sign in

    }
    @Test //(priority = 2)
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
    @Test
    public void negatovPagefactory4(){

        LoginJetB_2 loginPage = new LoginJetB_2();
        loginPage.enterUsername("454545");
        loginPage.enterPassword("12456");
        loginPage.clickLoginButton();
        Assert.assertNotEquals( Driver.getDriver().getTitle(), "JetBlue | Airline Tickets, Flights & Airfare: Book Direct - Official Site");

    }
    @Test
    public void negatovPagefactory5(){

        LoginJetB_2 loginPage = new LoginJetB_2();
        loginPage.enterUsername("454545");
        loginPage.enterPassword("bkkhkj");
        loginPage.clickLoginButton();
        Assert.assertNotEquals( Driver.getDriver().getTitle(), "JetBlue | Airline Tickets, Flights & Airfare: Book Direct - Official Site");

    }
    @Test
    public void negatovPagefactory6(){

        LoginJetB_2 loginPage = new LoginJetB_2();
        loginPage.enterUsername("afhjadhfjhaj");
        loginPage.enterPassword("-125454");
        loginPage.clickLoginButton();
        Assert.assertNotEquals( Driver.getDriver().getTitle(), "JetBlue | Airline Tickets, Flights & Airfare: Book Direct - Official Site");

    }
    @Test
    public void negatovPagefactory7(){

        LoginJetB_2 loginPage = new LoginJetB_2();
        loginPage.enterUsername("-154545454");
        loginPage.enterPassword("-125454");
        loginPage.clickLoginButton();
        Assert.assertNotEquals( Driver.getDriver().getTitle(), "JetBlue | Airline Tickets, Flights & Airfare: Book Direct - Official Site");

    }
    @Test
    public void negatovPagefactory8(){

        LoginJetB_2 loginPage = new LoginJetB_2();
        loginPage.enterUsername("-154545454");
        loginPage.enterPassword("kljskfkl");
        loginPage.clickLoginButton();
        Assert.assertNotEquals( Driver.getDriver().getTitle(), "JetBlue | Airline Tickets, Flights & Airfare: Book Direct - Official Site");

    }
}