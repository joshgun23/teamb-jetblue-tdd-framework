package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class JetBlueHomePage {

    public JetBlueHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    // LOCATORS

    @FindBy(xpath = "//span[contains(text(),'Flights + Hotel')]")
    private WebElement flightsHotelButton;
    @FindBy(xpath = "//input[@id='jb-autocomplete-3-search']")
    private WebElement fromOriginButton;

    @FindBy(xpath = "//input[@id='jb-autocomplete-4-search']")
    private WebElement toDestinationButton;

    @FindBy(xpath = "//input[@id='jb-date-picker-input-id-2']")
    private WebElement departDateButton;

    @FindBy(xpath = "//input[@id='jb-date-picker-input-id-3']")
    private WebElement returnDateButton;

    @FindBy(xpath = "//span[normalize-space()='Search flights + hotel']")
    private WebElement searchFlightsHotelButton;

    @FindBy(xpath = "//span[@class='s-body royal-blue hover-core-blue b mr2']")
    private WebElement selectRooms;

    @FindBy(xpath = "//button[@aria-label='add room']")
    private WebElement addRoom;

    @FindBy(xpath = "//button[@aria-label='add adult']")
    private WebElement addAdult;


// Return methods

    public WebElement getFlightsHotelButton() {
        return flightsHotelButton;
    }

    public WebElement getFromOriginButton() {
        return fromOriginButton;
    }

    public WebElement getToDestinationButton() {
        return toDestinationButton;
    }

    public WebElement getDepartDateButton() {
        return departDateButton;
    }

    public WebElement getReturnDateButton() {
        return returnDateButton;
    }

    public WebElement getSearchFlightsHotelButton() {
        return searchFlightsHotelButton;
    }

    public WebElement getSelectRooms() {
        return selectRooms;
    }

    public WebElement getAddRoom() {
        return addRoom;
    }

    public WebElement getAddAdult() {
        return addAdult;
    }

}

