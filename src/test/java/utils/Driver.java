package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {

    private static ThreadLocal<WebDriver> drivers =  new ThreadLocal<>();

    private Driver(){}

    public static synchronized WebDriver getDriver(){


        String browser = System.getProperty("browser");

        if (browser == null){
            browser = ConfigReader.getProperty("browser");
        }


        if(drivers.get() == null) {


            switch (browser) {
                case "chrome":
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--remote-allow-origins=*");
                    drivers.set(new ChromeDriver(options));
                    break;
                case "headlessChrome":
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments("--remote-allow-origins=*");
                    chromeOptions.addArguments("--headless");
                    drivers.set(new ChromeDriver(chromeOptions));
                    break;
                case "edge":
                    drivers.set(new EdgeDriver());
                    break;
                case "headlessEdge":
                    EdgeOptions edgeOptions = new EdgeOptions();
                    edgeOptions.addArguments("--headless");
                    drivers.set(new EdgeDriver(edgeOptions));
                    break;
                case "firefox":
                    drivers.set(new FirefoxDriver());
                    break;
                case "headlessFirefox":
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    firefoxOptions.addArguments("--headless");
                    drivers.set(new FirefoxDriver(firefoxOptions));
                    break;
                case "safari":
                    drivers.set(new SafariDriver());
                    break;
                default:
                    throw new RuntimeException("Unsupported browser");


            }

        }

        return  drivers.get();
    }


    public synchronized static void quitDriver(){

        if(drivers.get() != null){
            drivers.get().quit();
            drivers.remove();
        }

    }


}