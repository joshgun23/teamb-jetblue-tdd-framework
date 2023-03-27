package Tests_Sprint_2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages_Sprint_2.Travel_info_Z;
import tests.TestBase2;
import utils.Driver;
import utils.SeleniumUtils;



public class Travel_info_Z_Test extends TestBase2 {

    @Test(dataProvider = "testData")
    public void fillOutForm(String fullName, String email, String phone, String alternatePhone) {

        Travel_info_Z travelInfoPage = new Travel_info_Z();
        travelInfoPage.fillOutForm(fullName, email, phone, alternatePhone);
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Travel Info"));

    }

    @DataProvider
    public Object[][] provideTestData()  {
        return  SeleniumUtils.readFromCSV("data.csv");
    }
}








