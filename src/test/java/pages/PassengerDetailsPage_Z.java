package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class PassengerDetailsPage_Z {
    public PassengerDetailsPage_Z(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(id = "jb-passenger-first-name-0")
    WebElement firstNameInput;

    @FindBy(id = "jb-passenger-last-name-0")
    WebElement lastNameInput;

    @FindBy(id = "jb-passenger-gender-0-male")
    WebElement maleGenderRadioButton;

    @FindBy(id = "jb-passenger-gender-0-female")
    WebElement femaleGenderRadioButton;

    @FindBy(id = "jb-passenger-date-of-birth-0")
    WebElement dateOfBirthInput;

    @FindBy(css = "button[data-analytics-id='btn-continue']")
    WebElement continueButton;


    public void enterPassengerDetails(String firstName, String lastName, String gender, String dateOfBirth) {
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        if (gender.equalsIgnoreCase("male")) {
            maleGenderRadioButton.click();
        } else if (gender.equalsIgnoreCase("female")) {
            femaleGenderRadioButton.click();
        }
        dateOfBirthInput.sendKeys(dateOfBirth);
    }

    public void clickContinueButton() {
        continueButton.click();
    }
}
