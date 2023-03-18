package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class JetBlueHomePage {

    public JetBlueHomePage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }

    // LOCATORS

    @FindBy(xpath = "//span[class='Flights + Hotel']")
    private WebElement flightsHotelButton;
    @FindBy(id = "text-field-primary")
    private WebElement fromOriginButton;

    @FindBy(id="jb-autocomplete-2-search")
    private WebElement toDestinationButton;

    @FindBy(id="jb-date-picker-input-id-0")
    private WebElement departDateButton;

    @FindBy(id="jb-date-picker-input-id-1")
    private WebElement returnDateButton;

    @FindBy(xpath = "//button[@class='btn btn-action'][contains(text(),'Search Flights + Hotel')]")
    private WebElement searchFlightsHotelButton;

    @FindBy(xpath = "//input[@name='trueblue-checkbox'][@type='checkbox']")
    private WebElement useTrueBluePointsCheckbox;


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

    public WebElement getUseTrueBluePointsCheckbox() {
        return useTrueBluePointsCheckbox;
    }

}
