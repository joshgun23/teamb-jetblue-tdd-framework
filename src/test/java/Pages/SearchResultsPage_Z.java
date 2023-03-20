package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage_Z {
    public SearchResultsPage_Z(){PageFactory.initElements(driver, this);}
    WebDriver driver;

    @FindBy(css = "h1.page-title__title")
    WebElement searchResultsTitle;

    @FindBy(css = "label[for='jb-filter-price']")
    WebElement priceFilter;

    @FindBy(css = "label[for='jb-sort-duration']")
    WebElement durationSort;

    @FindBy(css = "ul.result-list li:first-of-type button")
    WebElement selectFlightButton;

    public SearchResultsPage_Z(WebDriver driver) {
        this.driver = driver;

    }

    public void verifySearchResultsPage() {
        // Verify search results page is displayed

    }

    public void selectFilter(String filterName) {
        // Select the specified filter
    }

    public void verifySearchResultsFilteredByPrice() {
        // Verify search results are filtered by price
    }

    public void selectSortOption(String sortOption) {
        // Select the specified sort option
    }

    public void verifySearchResultsSortedByDuration() {
        // Verify search results are sorted by duration
    }

    public void selectFlight() {
        selectFlightButton.click();
    }
}
