package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class ConfirmationPage_Z {
    public ConfirmationPage_Z() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "h1.page-title__title")
    WebElement confirmationTitle;


    public void verifyConfirmationPage() {
        confirmationTitle.isDisplayed();


    }
}
