package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.Driver;

import static org.testng.Assert.assertTrue;


public class knowUs_Eric extends TestBase {


    @Test
    public void testKnowUsLinkInMainNavigationMenu () {






        WebElement knowUsLink =  Driver.getDriver().findElement( By.xpath( "(//a[@class='royal-blue s-body mt3 no-underline avenir lh-18 mt2-l'][normalize-space()='Our Company'])[1]" ) );
        knowUsLink.click();
//        WebElement knowUsSection =  Driver.getDriver().findElement( By.id( "Our Company" ) );
//        assertTrue( knowUsSection.isDisplayed() );
        System.out.println(Driver.getDriver().findElement( By.xpath("(//a[@class='royal-blue s-body mt3 no-underline avenir lh-18 mt2-l'][normalize-space()='Our Company'])[1]")).getText());
        assertTrue(Driver.getDriver().getCurrentUrl().contains( " Our Company ") );

    }

}
