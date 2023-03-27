package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import pages.SignIn2;
import pages.TrueBlueButton2;
import utils.ConfigReader;
import utils.Driver;
import utils.SeleniumUtils;

import java.lang.reflect.Method;
import java.time.Duration;

public class TestBaseForLogin {protected static ExtentReports extentReport;
    protected static ExtentSparkReporter htmlReport;
    protected static ExtentTest logger;

    @BeforeSuite(alwaysRun = true)
    public void setupReport(){
        extentReport = new ExtentReports();
        String path = System.getProperty("user.dir") + "/target/extentReports/report.html";
        System.out.println(path);
        htmlReport =  new ExtentSparkReporter(path);
        extentReport.attachReporter(htmlReport);

        extentReport.setSystemInfo("Name", "Web Orders Automated Tests");
        extentReport.setSystemInfo("SDET", "John Doe");
        extentReport.setSystemInfo("Environment", ConfigReader.getProperty("env"));
        extentReport.setSystemInfo("Browser", ConfigReader.getProperty("browser"));
        extentReport.setSystemInfo("OS", System.getProperty("os.name"));
        extentReport.setSystemInfo("URL", ConfigReader.getProperty("url"));


    }

    @BeforeMethod (alwaysRun = true)
    public void setUpEachMethod(Method method)  {

        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        WebElement element1 = Driver.getDriver().findElement(By.xpath("//*[@class=\"truste_popframe\"]"));
        Driver.getDriver().switchTo().frame(element1);
        Driver.getDriver().findElement(By.xpath("//a[@class='call']")).click();
        SeleniumUtils.waitFor(2);
        logger = extentReport.createTest(method.getName());

        TrueBlueButton2 trueBlueButton2 = new TrueBlueButton2();
        trueBlueButton2.enterTrue2();
        Assert.assertTrue(Driver.getDriver().getPageSource().contains(trueBlueButton2.getGetmesage()));

        SignIn2 signIn2 = new SignIn2();
        signIn2.entersignIn2();
        Assert.assertEquals(Driver.getDriver().getTitle(),"JetBlue | Airline Tickets, Flights & Airfare: Book Direct - Official Site");
        SeleniumUtils.waitFor(2);

    }

    @AfterMethod(alwaysRun = true)
    public void tearDownMethod(ITestResult testResult){

        if(testResult.getStatus() == ITestResult.SUCCESS){
            logger.pass("TEST PASSED.");
        } else if (testResult.getStatus() == ITestResult.FAILURE) {
            logger.fail("TEST FAILED.");
            logger.fail(testResult.getThrowable());
            String path = SeleniumUtils.getScreenshot("failed");
            logger.addScreenCaptureFromPath(path);
        }else{
            logger.skip("TEST SKIPPED.");
        }


        Driver.quitDriver();
    }


    @AfterSuite(alwaysRun = true)
    public void tearDownReport(){
        extentReport.flush();
    }


}