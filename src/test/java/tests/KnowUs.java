package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ConfigReader;
import utils.Driver;

import java.time.Duration;

import static org.testng.Assert.assertTrue;
public class KnowUs extends TestBase {


    @Test
    public void testKnowUsSection()  {



        WebElement getToKnowUsSection = Driver.getDriver().findElement( By.xpath( "//h4[text()='Get To Know Us']" ) );
        Assert.assertTrue( getToKnowUsSection.isDisplayed(), "'Get To Know Us' section is visible" );

    }

    @Test
    public void knowUsVisible() {


        WebElement getToKnowUsSection = Driver.getDriver().findElement( By.xpath( "//a[text()='Our Company']" ) );
        Assert.assertTrue( getToKnowUsSection.isDisplayed(), "'Our Company' section is visible" );

        WebElement getOurPlanes = Driver.getDriver().findElement( By.xpath( "//a[text()='Our Planes']" ) );
        Assert.assertTrue( getOurPlanes.isDisplayed(), "'Our Planes' section is visible" );

        WebElement getPartnerAirlines = Driver.getDriver().findElement( By.xpath( "//a[text()='Partner Airlines']" ) );
        Assert.assertTrue( getPartnerAirlines.isDisplayed(), "'PartnerAirlines' section is visible" );

        WebElement getInvestorRelations = Driver.getDriver().findElement( By.xpath( "//a[text()='Investor Relations']" ) );
        Assert.assertTrue( getInvestorRelations.isDisplayed(), "'Investor Relations' section is visible" );

        WebElement getTravelAgents = Driver.getDriver().findElement( By.xpath( "//a[text()='Travel Agents']" ) );
        Assert.assertTrue( getTravelAgents.isDisplayed(), "'Travel Agents' section is visible" );

        WebElement getSponsorships = Driver.getDriver().findElement( By.xpath( "//a[text()='Sponsorships']" ) );
        Assert.assertTrue( getSponsorships.isDisplayed(), "'Sponsorships' section is visible" );

        WebElement getCareers = Driver.getDriver().findElement( By.xpath( "//a[text()='Careers']" ) );
        Assert.assertTrue( getCareers.isDisplayed(), "'Careers' section is visible" );

        WebElement getSiteMap = Driver.getDriver().findElement( By.xpath( "//a[text()='Site Map']" ) );
        Assert.assertTrue( getSiteMap.isDisplayed(), "'Site Map' section is visible" );


    }

    @Test
    public void testCareerLink() {



        WebElement aboutUsLink = Driver.getDriver().findElement( By.linkText( "Careers" ) );
        aboutUsLink.click();

    }

    @Test
    public void  Contact(){


       Driver.getDriver().findElement( By.linkText( "Contact Us" ) ).click();


    }

    }
