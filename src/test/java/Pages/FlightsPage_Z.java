package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class FlightsPage_Z {
  public FlightsPage_Z(){PageFactory.initElements(Driver.getDriver(), this);}
    WebDriver driver;

    @FindBy(id = "jb-radio-1")
    WebElement oneWayRadioButton;

    @FindBy(id = "jb-radio-2")
    WebElement roundTripRadioButton;

    @FindBy(id = "jb-booking-form__input-origin")
    WebElement originInput;

    @FindBy(id = "jb-booking-form__input-destination")
    WebElement destinationInput;

    @FindBy(id = "jb-booking-form__input-departure-date")
    WebElement departureDateInput;

    @FindBy(id = "jb-booking-form__input-return-date")
    WebElement returnDateInput;

    @FindBy(css = "button[type='submit']")
    WebElement searchButton;

    public FlightsPage_Z(WebDriver driver) {
        this.driver = driver;

    }

    public void enterFlightDetails(String origin, String destination, String departureDate, String passengers) {
        originInput.sendKeys(origin);
        destinationInput.sendKeys(destination);
        departureDateInput.sendKeys(departureDate);
        // Enter passenger details here
    }

    public void enterFlightDetails(String origin, String destination, String departureDate, String returnDate, String passengers) {
        originInput.sendKeys(origin);
        destinationInput.sendKeys(destination);
        departureDateInput.sendKeys(departureDate);
        returnDateInput.sendKeys(returnDate);
        // Enter passenger details


    }

    public void clickOneWayButton() {
        oneWayRadioButton.click();
    }

    public void clickRoundTripButton() {
        roundTripRadioButton.click();
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void selectFlight(int i) {
        // Select the flight






    }
}
