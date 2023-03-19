package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class JoinToday {

    private WebElement joinT =  Driver.getDriver().findElement(By.xpath("(//a[@class='pointer avenir b no-underline t-med-bg t-out-hover w-100 w-auto-ns tc border-box inline-flex align-items-center justify-center jb-button-primary jb-button-medium b--none bg-royal-blue br-rounded-2 s-body hover-white white w-max-ns ng-star-inserted'])[1]"));
    private String getmagese = "JetBlue";

    public void enterJoin(){
        this.joinT.click();
    }

    public String getGetmagese() {
        return getmagese;
    }
}


