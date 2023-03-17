package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_Z{
    WebDriver driver;

    @FindBy(css = "a[data-analytics-id='hdr-book-trip']")
    WebElement flightsTabLink;

    public HomePage_Z(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickFlightsTab() {
        flightsTabLink.click();
    }
}









