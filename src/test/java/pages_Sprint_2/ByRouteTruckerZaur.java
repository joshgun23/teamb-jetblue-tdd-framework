package pages_Sprint_2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.TestBase2;
import utils.Driver;

public class ByRouteTruckerZaur extends TestBase2 {

    public ByRouteTruckerZaur() {
        PageFactory.initElements(Driver.getDriver(), this);}

        @FindBy(xpath = "//*[@id=\"jb-header-theme\"]/div/div/div/jb-subnav-desktop/nav/ul/li[4]/a/span")
        public WebElement flight;


        @FindBy(linkText = "Flight Tracker")
        public WebElement trucker;



        @FindBy(xpath = "//span[text()='By flight number']")
        public WebElement byFlightNumber;

    @FindBy(xpath = "//*[@class=\"db\"]/div")
        public WebElement getFlightNumber;
    @FindBy(xpath = "/html/body/jb-app/main/jb-basic-template/jb-renderer-template/jb-flight-tracker/jb-flight-tracker-search/jb-flight-tracker-results/div/div/div/h2")
    public WebElement directflight;
        @FindBy(xpath = "ng-star-inserted")
        public WebElement departureDate;

        @FindBy(xpath = "class=\"ng-star-inserted\"")
        public WebElement check;


}
