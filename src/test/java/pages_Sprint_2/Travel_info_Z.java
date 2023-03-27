package pages_Sprint_2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Driver;

import java.time.Duration;


public class Travel_info_Z  {

    private WebDriverWait wait ;

    public   Travel_info_Z() {
        PageFactory.initElements(Driver.getDriver(), this);
        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
    }
    @FindBy(xpath = "//span[contains(text(),'Travel Info')]")
    public WebElement travelInfo;


    @FindBy(css = "[href='\\/traveling-together\\/group-travel']")
    public WebElement groupTravel;

    @FindBy(className = "b pr3 pr5-m pr7-l tl")
    public WebElement leisureGroup;

   @FindBy(css = ".b--none.db.jb-expansion-panel.ng-star-inserted.ng-tns-c115-7.secondary.t-fast.w-100 .b.pr3.pr5-m.pr7-l.tl")
     public WebElement incentiveGroup;

   @FindBy(css = ".b--none.db.jb-expansion-panel.ng-star-inserted.ng-tns-c115-8.secondary.t-fast.w-100 .b.pr3.pr5-m.pr7-l.tl")
   public WebElement meetingGroup;

   @FindBy(css = ".avenir.b--solid.ba.bg-white.body.jb-form-field.jb-input.ng-invalid.ng-pristine.ng-touched.pb2.pl3.pr2.pt4.w-100")
    public WebElement fullName;

   @FindBy(css = "jb-form-field-container:nth-of-type(2)  .avenir.b--solid.ba.bg-white.body.jb-form-field.jb-input.ng-invalid.ng-pristine.ng-untouched.pb2.pl3.pr2.pt4.w-100")
    public WebElement email;

   @FindBy(css = "jb-form-field-container:nth-of-type(3)  .avenir.b--solid.ba.bg-white.body.jb-form-field.jb-input.ng-invalid.ng-pristine.ng-untouched.pb2.pl3.pr2.pt4.w-100")
    public WebElement phone;

   @FindBy(css = "jb-form-field-container:nth-of-type(4)  .avenir.b--solid.ba.bg-white.body.jb-form-field.jb-input.ng-pristine.ng-untouched.ng-valid.pb2.pl3.pr2.pt4.w-100")
    public WebElement alternatePhone;

   public void fillOutForm(String fullName, String email, String phone, String alternatePhone) {
       wait.until(ExpectedConditions.visibilityOf(this.travelInfo));
       this.fullName.sendKeys(fullName);
       this.email.sendKeys(email);
       this.phone.sendKeys(phone);
       this.alternatePhone.sendKeys(alternatePhone);
   } }

