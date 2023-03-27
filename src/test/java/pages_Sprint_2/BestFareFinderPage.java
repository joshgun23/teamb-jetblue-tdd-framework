package pages_Sprint_2;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Driver;
import utils.SeleniumUtils;

import java.time.Duration;

public class BestFareFinderPage {

    private WebDriverWait wait;

    public BestFareFinderPage () {
        PageFactory.initElements(Driver.getDriver(), this);
        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));

    }

// Locators

    @FindBy(linkText = "Book")
    private WebElement bookOption;

    @FindBy(linkText = "Best Fare Finder")
    private WebElement bestFareFinder;

    @FindBy(id = "jb-autocomplete-0-search")
    private WebElement fromInputField;

    @FindBy(id = "jb-autocomplete-1-search")
    private WebElement toInputField;

    @FindBy(xpath = "//span[normalize-space()='Explore fares']")
    private WebElement exploreFaresButton;

    @FindBy(xpath = "//p[@role='alert']")
    private WebElement errorMessage;

    @FindBy(xpath = "//div[normalize-space()='Select depart date']")
    private WebElement departureDate;



// Return methods

    public WebElement getBookOption() { return bookOption; }

    public void clickOnBook() { bookOption.click(); }

    public WebElement getBestFareFinder() { return bestFareFinder; }

    public void clickOnBestFareFinder () { bestFareFinder.click(); }

    public WebElement getExploreFaresButton() { return exploreFaresButton; }

    public void clickOnExploreFares() { exploreFaresButton.click();}

    public WebElement getFromInputField() { return fromInputField; }

    public WebElement getErrorMessage() { return errorMessage; }

    public WebElement getDepartureDate() {return departureDate; }

    public WebElement getToInputField() { return toInputField; }


    public void flightFrom(String from) {
        wait.until(ExpectedConditions.elementToBeClickable(this.fromInputField)).click();
        fromInputField.click();
        fromInputField.clear();
        fromInputField.sendKeys(from);
        fromInputField.sendKeys(Keys.ENTER);
    }


    public void flightTo(String to) {
        wait.until(ExpectedConditions.elementToBeClickable(this.toInputField)).click();
        toInputField.click();
        toInputField.clear();
        toInputField.sendKeys(to);
    }

    public void flightToExplore(String city) {
        wait.until(ExpectedConditions.elementToBeClickable(this.toInputField)).click();
        toInputField.click();
        toInputField.clear();
        toInputField.sendKeys(city);
        toInputField.sendKeys(Keys.ENTER);
    }
}
