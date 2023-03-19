package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class InAction_Page_M {


        public  InAction_Page_M(){
            PageFactory.initElements(Driver.getDriver(), this);
        }

        @FindBy(linkText="JetBlue For Good")
        public WebElement ForGood;


        @FindBy(linkText="Sustainability")
        public WebElement sustain;


        @FindBy(linkText="Diversity Equity & Inclusion")
        public WebElement inclusion;


        @FindBy(linkText="Military")
        public WebElement military;

    }



