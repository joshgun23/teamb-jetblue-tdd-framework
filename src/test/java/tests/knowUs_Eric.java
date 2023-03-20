package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Driver;

import static org.testng.Assert.assertTrue;


public class knowUs_Eric extends TestBase {


    @Test
    public void testKnowUsLinkInMainNavigationMenu () {






        WebElement knowUsLink =  Driver.getDriver().findElement( By.xpath( "(//a[@class='royal-blue s-body mt3 no-underline avenir lh-18 mt2-l'][normalize-space()='Our Company'])[1]" ) );
        knowUsLink.click();
        System.out.println(Driver.getDriver().findElement( By.xpath("(//a[@class='royal-blue s-body mt3 no-underline avenir lh-18 mt2-l'][normalize-space()='Our Company'])[1]")).getText());
        Assert.assertEquals(Driver.getDriver().getTitle(),"Our Company | JetBlue");

    }

}
