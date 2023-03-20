package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage_Z {
    public ConfirmationPage_Z(){PageFactory.initElements(driver, this);}
    WebDriver driver;
    @FindBy(css = "h1.page-title__title")
    WebElement confirmationTitle;

    public ConfirmationPage_Z(WebDriver driver) {
        this.driver = driver;

    }

    public void verifyConfirmationPage() {
        confirmationTitle.isDisplayed();



    }}
