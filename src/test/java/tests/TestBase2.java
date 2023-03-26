package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import utils.ConfigReader;
import utils.Driver;
import utils.SeleniumUtils;

import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.Properties;

public class TestBase2 {protected static ExtentReports extentReport; // manages the report generation
    protected static ExtentSparkReporter htmlReport; // generates the html report
    protected static ExtentTest logger; // manages the individual test steps and logs

    @BeforeSuite(alwaysRun = true)
    public void setupReport(){
        extentReport = new ExtentReports();
        String path = System.getProperty("user.dir") + "/target/extentReports/report.html";
        System.out.println(path);
        htmlReport =  new ExtentSparkReporter(path);
        extentReport.attachReporter(htmlReport);

        extentReport.setSystemInfo("Name", "JETBlue");
        extentReport.setSystemInfo("SDET", "TeamB");
        extentReport.setSystemInfo("Environment", ConfigReader.getProperty("env"));
        extentReport.setSystemInfo("Browser", ConfigReader.getProperty("browser"));
        extentReport.setSystemInfo("OS", System.getProperty("os.name"));
        extentReport.setSystemInfo("URL", ConfigReader.getProperty("url"));


    }

    @BeforeMethod (alwaysRun = true)
    public void setUpEachMethod(Method method)  {

        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        WebElement element1 = Driver.getDriver().findElement(By.xpath("//*[@class=\"truste_popframe\"]"));
        Driver.getDriver().switchTo().frame(element1);
        Driver.getDriver().findElement(By.xpath("//a[@class='call']")).click();
        SeleniumUtils.waitFor(2);
        logger = extentReport.createTest(method.getName());

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