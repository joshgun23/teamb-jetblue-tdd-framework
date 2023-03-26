package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {

private static WebDriver driver;

    private Driver(){} //to prevent instantiation

    public static WebDriver getDriver(){

        String browser = ConfigReader.getProperty("browser");

        if(driver == null) { // check if the driver is initialized

            switch (browser) {
                case "chrome":
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments("--remote-allow-origins=*");
                    driver = new ChromeDriver(chromeOptions); // Coshgun I add fix for chrome browser-Ziyoda
                    break;
                case "edge":
                    driver = new EdgeDriver();
                    break;
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                case "safari":
                    driver = new SafariDriver();
                    break;
                default:
                    throw new RuntimeException("Unsupported browser");


            }

        }

        return driver; // if already initialized previously, return this initialized object
    }


    public static void quitDriver(){

        if(driver != null){  // if the driver is active
            driver.quit();  // quit the driver
            driver = null;  // set the driver variable value to null because next initialization of driver checks if it is null
        }

    }


}