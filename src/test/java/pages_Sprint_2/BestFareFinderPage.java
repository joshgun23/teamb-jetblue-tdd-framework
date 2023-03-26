package pages_Sprint_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class BestFareFinderPage {

    public BestFareFinderPage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

// Locators

    @FindBy(linkText = "Book")
    private WebElement bookOption;

    @FindBy(linkText = "Best Fare Finder")
    private WebElement bestFareFinder;


// Return methods

    public WebElement getBookOption() { return bookOption; }

    public void clickOnBook() { bookOption.click(); }

    public WebElement getBestFareFinder() { return bestFareFinder; }

    public void clickOnBestFareFinder () { bestFareFinder.click();
    }



}
