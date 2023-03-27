package tests_Sprint_2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages_Sprint_2.Travel_info_Z;
import tests.TestBase2;
import utils.Driver;
import utils.SeleniumUtils;



public class Travel_info_Z_Test extends TestBase2 {


    @Test (dataProvider = "provideData4",enabled = false)
    public void fillOutForm(String fullName, String email, String phone, String alternatePhone)throws InterruptedException {

        pages_Sprint_2.Travel_info_Z travelInfoPage = new pages_Sprint_2.Travel_info_Z();
//        travelInfoPage.fillOutForm(fullName, email, phone, alternatePhone);
        travelInfoPage.travelI();
        travelInfoPage.groupT();
        SeleniumUtils.waitFor(2);
        travelInfoPage.fulName(fullName);
        travelInfoPage.emailL(email);
        travelInfoPage.phoneN(phone);
        travelInfoPage.alterPhone(alternatePhone);
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Travel Info"));

    }


    @DataProvider
    public Object[][] provideData4() {
        return SeleniumUtils.readFromCSV("data.cvs");
    }
}







