package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightDetailsPage_Z {
    WebDriver driver;
    @FindBy(css = "button[data-analytics-id='btn-continue']")
    WebElement continueButton;

    public FlightDetailsPage_Z(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickContinueButton() {
        continueButton.click();
    }

    public void enterFromAndToLocations(String bangalore, String delhi) {

    }

    public void enterDepartureDate(String s) {

    }

    public void clickSearchButton() {

    }
}

