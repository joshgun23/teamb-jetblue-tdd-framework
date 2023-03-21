package tests;

import pages.LoginJetB;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ConfigReader;
import utils.Driver;

public class LoginTests_POM extends TestBase_For_Login_POM{

    @Test
    public void negativ() throws InterruptedException  {


        LoginJetB loginJetB = new LoginJetB();
        loginJetB.enterUsername("bsd");
        loginJetB.enterPassword("bsd");
        loginJetB.clickLoginButton();
        Assert.assertNotEquals( Driver.getDriver().getTitle(), "JetBlue | Airline Tickets, Flights & Airfare: Book Direct - Official Site\"");
    }
    @Test //(priority = 1)
    public void positivePageObjectModel(){

        LoginJetB loginPage = new LoginJetB();
        loginPage.enterUsername(ConfigReader.getProperty("username"));
        loginPage.enterPassword(ConfigReader.getProperty("password"));
        loginPage.clickLoginButton();
        Assert.assertEquals( Driver.getDriver().getTitle(), "Sign In | JetBlue");
        //when we do it test webaplication not give permisein to sign in

    }
    @Test (groups = {"smoke"})//(priority = 2)
    public void negativ2() throws InterruptedException  {


        LoginJetB loginJetB = new LoginJetB();
        loginJetB.enterUsername(ConfigReader.getProperty("username"));
        loginJetB.enterPassword("12215");
        loginJetB.clickLoginButton();
        Assert.assertNotEquals( Driver.getDriver().getTitle(), "JetBlue | Airline Tickets, Flights & Airfare: Book Direct - Official Site\"");
    }
    @Test
    public void negativ3() throws InterruptedException  {


        LoginJetB loginJetB = new LoginJetB();
        loginJetB.enterUsername("teamb");
        loginJetB.enterPassword(ConfigReader.getProperty("password"));
        loginJetB.clickLoginButton();
        Assert.assertNotEquals( Driver.getDriver().getTitle(), "JetBlue | Airline Tickets, Flights & Airfare: Book Direct - Official Site\"");
    }
    @Test
    public void negatovPom4(){

        LoginJetB loginPage = new LoginJetB();
        loginPage.enterUsername("454545");
        loginPage.enterPassword("12456");
        loginPage.clickLoginButton();
        Assert.assertNotEquals( Driver.getDriver().getTitle(), "JetBlue | Airline Tickets, Flights & Airfare: Book Direct - Official Site");

    }
    @Test
    public void negatovPom5(){

        LoginJetB loginPage = new LoginJetB();
        loginPage.enterUsername("454545");
        loginPage.enterPassword("bkkhkj");
        loginPage.clickLoginButton();
        Assert.assertNotEquals( Driver.getDriver().getTitle(), "JetBlue | Airline Tickets, Flights & Airfare: Book Direct - Official Site");

    }
    @Test
    public void negatovPom6(){

        LoginJetB loginPage = new LoginJetB();
        loginPage.enterUsername("afhjadhfjhaj");
        loginPage.enterPassword("-125454");
        loginPage.clickLoginButton();
        Assert.assertNotEquals( Driver.getDriver().getTitle(), "JetBlue | Airline Tickets, Flights & Airfare: Book Direct - Official Site");

    }
    @Test
    public void negatovPom7(){

        LoginJetB loginPage = new LoginJetB();
        loginPage.enterUsername("-154545454");
        loginPage.enterPassword("-125454");
        loginPage.clickLoginButton();
        Assert.assertNotEquals( Driver.getDriver().getTitle(), "JetBlue | Airline Tickets, Flights & Airfare: Book Direct - Official Site");

    }
    @Test
    public void negatovPom8(){

        LoginJetB loginPage = new LoginJetB();
        loginPage.enterUsername("-154545454");
        loginPage.enterPassword("kljskfkl");
        loginPage.clickLoginButton();
        Assert.assertNotEquals( Driver.getDriver().getTitle(), "JetBlue | Airline Tickets, Flights & Airfare: Book Direct - Official Site");

    }
}
