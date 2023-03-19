package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class JoinToday2 {

    public JoinToday2(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="(//a[@class='pointer avenir b no-underline t-med-bg t-out-hover w-100 w-auto-ns tc border-box inline-flex align-items-center justify-center jb-button-primary jb-button-medium b--none bg-royal-blue br-rounded-2 s-body hover-white white w-max-ns ng-star-inserted'])[1]")
    private WebElement joint;

    private String getmesage = "JetBlue";
    public void enterJoin2(){
        this.joint.click();
    }

    public String getGetmesage() {
        return getmesage;
    }
}



