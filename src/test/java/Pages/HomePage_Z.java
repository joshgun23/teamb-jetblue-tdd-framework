package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage_Z {
    public HomePage_Z() {
        PageFactory.initElements(driver, this);
    }

    WebDriver driver;

    @FindBy(css = "a[data-analytics-id='hdr-book-trip']")
    WebElement flightsTabLink;

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

    @FindBy(css = "button[data-testid='jb-pax__button--done']")
    private WebElement doneButton;

    @FindBy(css = "div[data-testid='jb-pax__dropdown-container'] div[data-testid='jb-stepper__label']")
    private List<WebElement> passengerStepperLabels;

    @FindBy(css = "div[data-testid='jb-pax__dropdown-container'] button[data-testid='jb-stepper__subtract-button']")
    private List<WebElement> subtractButtons;

    @FindBy(css = "div[data-testid='jb-pax__dropdown-container'] button[data-testid='jb-stepper__add-button']")
    private List<WebElement> addButtons;


    public HomePage_Z(WebDriver driver) {
        this.driver = driver;

    }

    public void clickFlightsTab() {
        flightsTabLink.click();
    }

    public void selectOneWay() {
        oneWayRadioButton.click();
    }

    public void enterOrigin(String origin) {
        originInput.sendKeys(origin);
    }

    public void enterDestination(String destination) {
        destinationInput.sendKeys(destination);
    }

    public void selectDepartureDate(String departureDate) {
        departureDateInput.sendKeys(departureDate);
    }

    public void selectPassengers(int adults, int children, int infants) {

        WebElement passengerDropdown = driver.findElement(By.cssSelector("button[data-testid='jb-booker-dropdown__button--pax']"));
        passengerDropdown.click();

        for (int i = 0; i < passengerStepperLabels.size(); i++) {
            WebElement label = passengerStepperLabels.get(i);

            if (label.getText().equals("Adults")) {
                for (int j = 1; j <= adults - 1; j++) {
                    addButtons.get(i).click();
                }
            } else if (label.getText().equals("Children")) {
                for (int j = 0; j < children; j++) {
                    addButtons.get(i).click();
                }
            } else if (label.getText().equals("Infants (in lap)")) {
                for (int j = 0; j < infants; j++) {
                    addButtons.get(i).click();
                }
            }
        }

        doneButton.click();
    }

    public void clickSearchButton() {
        searchButton.click();
    }

}










