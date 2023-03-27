package pages_Sprint_2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.TestBase;
import tests.TestBase2;
import utils.Driver;

public class TruckerByRouteZaur extends TestBase2 {



        public TruckerByRouteZaur() { PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//*[@id=\"jb-header-theme\"]/div/div/div/jb-subnav-desktop/nav/ul/li[4]/a/span")
    public WebElement flight;


    @FindBy(linkText = "Flight Tracker")
    public WebElement trucker;


    @FindBy(linkText = "By Route")
    public WebElement byRoute;

    @FindBy(xpath = "//*[@id='FLIGHT_TRACKER']/div/jb-form-field-container[1]/dot-city-selector/jb-autocomplete")
    public WebElement from;

    @FindBy(xpath = "//*[@id=\"FLIGHT_TRACKER\"]/div/jb-form-field-container[2]/dot-city-selector")
    public WebElement to;
    @FindBy(xpath = "//*[@id=\"jb-tabpanel-id-0\"]/div/div/form/button")
    public WebElement check;
    @FindBy(xpath = "/html/body/jb-app/main/jb-basic-template/jb-renderer-template/jb-flight-tracker/jb-flight-tracker-search/jb-flight-tracker-results/div/div/h2")
            public WebElement connection;

    @FindBy(xpath = "//*[@class='fl w-20 flight-number-column f4-ns pv1-ns']")
    public WebElement textflight;

    @FindBy(xpath = "//span[text()='By route']")
    public WebElement byroute;
    @FindBy(xpath = "//span[text()='Check status']")
    public WebElement status;
    @FindBy(xpath = "//*[@id='jb-autocomplete-6-option-item-0']")
    public WebElement first;

    @FindBy(xpath = "/html/body/jb-app/jb-footer/div[1]/div/div/div/h3")
    public WebElement needhelp;

public void trackByRoute() throws InterruptedException {
    TruckerByRouteZaur truckerByRouteZaur = new TruckerByRouteZaur();
    truckerByRouteZaur.flight.click();
    Thread.sleep(3000);
    truckerByRouteZaur.trucker.click();
    Thread.sleep(3000);
    Actions actions = new Actions(Driver.getDriver());
    actions.moveToElement(truckerByRouteZaur.from).click(truckerByRouteZaur.from).sendKeys("Baltimore, MD (BWI)").perform();
    // truckerFlight2Zaur.from.sendKeys("Baltimore, MD (BWI)");
    actions.moveToElement(truckerByRouteZaur.to).click(truckerByRouteZaur.to).sendKeys("New Orleans, LA (MSY)").perform();
    //truckerFlight2Zaur.date.click();
    actions.moveToElement(truckerByRouteZaur.first).click(truckerByRouteZaur.first).perform();
    truckerByRouteZaur.status.click();
}










    }


