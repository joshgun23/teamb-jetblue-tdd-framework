package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class SearchResultsPage_Z {
    public SearchResultsPage_Z(){PageFactory.initElements(Driver.getDriver(), this);}


    @FindBy(css = "h1.page-title__title")
    WebElement searchResultsTitle;

    @FindBy(css = "label[for='jb-filter-price']")
    WebElement priceFilter;

    @FindBy(css = "label[for='jb-sort-duration']")
    WebElement durationSort;

    @FindBy(css = "ul.result-list li:first-of-type button")
    WebElement selectFlightButton;


    public void verifySearchResultsPage() {
        searchResultsTitle.isDisplayed();




    }

    public void selectFilter(String filterName) {

        if (filterName.equalsIgnoreCase("price")) {
            priceFilter.click();
        } else if (filterName.equalsIgnoreCase("duration")) {
            durationSort.click();
        }

    }

    public void verifySearchResultsFilteredByPrice() {
        searchResultsTitle.isDisplayed();




    }

    public void selectSortOption(String sortOption) {
        if (sortOption.equalsIgnoreCase("price")) {
            priceFilter.click();
        } else if (sortOption.equalsIgnoreCase("duration")) {
            durationSort.click();
        }
    }

    public void verifySearchResultsSortedByDuration() {


    }

    public void selectFlight() {
        selectFlightButton.click();
    }
}
