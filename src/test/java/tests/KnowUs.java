package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ConfigReader;
import utils.Driver;
import utils.SeleniumUtils;

import java.time.Duration;
import java.time.Instant;

import static org.testng.AssertJUnit.assertTrue;
import static utils.Driver.driver;
import static utils.Driver.getDriver;

public class KnowUs {


    @Test
    public void testKnowUsSection() {


        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait( Duration.ofSeconds( 10 ) );
        getDriver().get( ConfigReader.getProperty( "url" ) );
        WebElement element1 = getDriver().findElement( By.xpath( "//*[@class=\"truste_popframe\"]" ) );
        getDriver().switchTo().frame( element1 );
        getDriver().findElement( By.xpath( "//a[@class='call']" ) ).click();
        SeleniumUtils.waitFor( 2 );

        WebElement getToKnowUsSection = getDriver().findElement( By.xpath( "//h4[text()='Get To Know Us']" ) );
        Assert.assertTrue( getToKnowUsSection.isDisplayed(), "'Get To Know Us' section is visible" );

    }

    @Test
    public void knowUsVisible() {

        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait( Duration.ofSeconds( 10 ) );
        getDriver().get( ConfigReader.getProperty( "url" ) );
        WebElement element1 = getDriver().findElement( By.xpath( "//*[@class=\"truste_popframe\"]" ) );
        getDriver().switchTo().frame( element1 );
        getDriver().findElement( By.xpath( "//a[@class='call']" ) ).click();
        SeleniumUtils.waitFor( 2 );



        WebElement getToKnowUsSection = getDriver().findElement( By.xpath( "//a[text()='Our Company']" ) );
        Assert.assertTrue( getToKnowUsSection.isDisplayed(), "'Our Company' section is visible" );

        WebElement getOurPlanes = getDriver().findElement( By.xpath( "//a[text()='Our Planes']" ) );
        Assert.assertTrue( getOurPlanes.isDisplayed(), "'Our Planes' section is visible" );

        WebElement getPartnerAirlines = getDriver().findElement( By.xpath( "//a[text()='Partner Airlines']" ) );
        Assert.assertTrue( getPartnerAirlines.isDisplayed(), "'PartnerAirlines' section is visible" );

        WebElement getInvestorRelations = getDriver().findElement( By.xpath( "//a[text()='Investor Relations']" ) );
        Assert.assertTrue( getInvestorRelations.isDisplayed(), "'Investor Relations' section is visible" );

        WebElement getTravelAgents = getDriver().findElement( By.xpath( "//a[text()='Travel Agents']" ) );
        Assert.assertTrue( getTravelAgents.isDisplayed(), "'Travel Agents' section is visible" );

        WebElement getSponsorships = getDriver().findElement( By.xpath( "//a[text()='Sponsorships']" ) );
        Assert.assertTrue( getSponsorships.isDisplayed(), "'Sponsorships' section is visible" );

        WebElement getCareers = getDriver().findElement( By.xpath( "//a[text()='Careers']" ) );
        Assert.assertTrue( getCareers.isDisplayed(), "'Careers' section is visible" );

        WebElement getSiteMap = getDriver().findElement( By.xpath( "//a[text()='Site Map']" ) );
        Assert.assertTrue( getSiteMap.isDisplayed(), "'Site Map' section is visible" );

        driver.quit();

    }

    @Test
    public void testCareerLink() {


        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait( Duration.ofSeconds( 10 ) );
        getDriver().get( ConfigReader.getProperty( "url" ) );
        WebElement element1 = getDriver().findElement( By.xpath( "//*[@class=\"truste_popframe\"]" ) );
        getDriver().switchTo().frame( element1 );
        getDriver().findElement( By.xpath( "//a[@class='call']" ) ).click();
        SeleniumUtils.waitFor( 2 );

        WebElement aboutUsLink = getDriver().findElement( By.linkText( "Careers" ) );
        aboutUsLink.click();


        driver.quit();
    }

    @Test
    public void  Contact(){

        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait( Duration.ofSeconds( 10 ) );
        getDriver().get( ConfigReader.getProperty( "url" ) );
        WebElement element1 = getDriver().findElement( By.xpath( "//*[@class=\"truste_popframe\"]" ) );
        getDriver().switchTo().frame( element1 );
        getDriver().findElement( By.xpath( "//a[@class='call']" ) ).click();
        SeleniumUtils.waitFor( 2 );

       getDriver().findElement( By.linkText( "Contact Us" ) ).click();
        driver.quit();

    }


    }
