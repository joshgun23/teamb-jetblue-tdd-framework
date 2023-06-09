package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class PaymentPage_Z {
    public PaymentPage_Z(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(id = "jb-payment-card-number")
    WebElement cardNumberInput;

    @FindBy(id = "jb-payment-expiration-date")
    WebElement expirationDateInput;

    @FindBy(id = "jb-payment-security-code")
    WebElement securityCodeInput;

    @FindBy(css = "button[data-analytics-id='btn-submit']")
    WebElement submitButton;


    public void enterPaymentDetails(String cardNumber, String expirationDate, String securityCode) {
        cardNumberInput.sendKeys(cardNumber);
        expirationDateInput.sendKeys(expirationDate);
        securityCodeInput.sendKeys(securityCode);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }}
