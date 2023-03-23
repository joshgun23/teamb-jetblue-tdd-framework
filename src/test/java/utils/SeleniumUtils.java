package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class SeleniumUtils {
    public static void clickRadioOrCheckbox(List<WebElement> elementList, String value) {
        for (WebElement el : elementList) {
            String actualValue = el.getAttribute("value").trim();

            if (actualValue.equals(value) && el.isEnabled()) {
                el.click();
                break;
            }
        }
    }
    public static void selectDropdown(WebElement element, String visibleText) {
        try {
            Select sel = new Select(element);
            sel.selectByVisibleText(visibleText);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void selectDropdown(WebElement element, int index) {
        try {
            Select sel = new Select(element);
            int size = sel.getOptions().size();
            if (size > index) {
                sel.selectByIndex(index);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void acceptAlert() {
        try {
            Alert alert = Driver.getDriver().switchTo().alert();
            alert.accept();
        } catch (NoAlertPresentException e) {
            e.printStackTrace();
        }
    }
    public static void dismissAlert() {
        try {
            Alert alert = Driver.getDriver().switchTo().alert();
            alert.dismiss();
        } catch (NoAlertPresentException e) {
            e.printStackTrace();
        }
    }
    public static String getAlertText() {
        String alertText = null;

        try {
            Alert alert = Driver.getDriver().switchTo().alert();
            alertText = alert.getText();
        } catch (NoAlertPresentException e) {
            e.printStackTrace();
        }

        return alertText;
    }
    public static void sendAlertText(String text) {
        try {
            Alert alert = Driver.getDriver().switchTo().alert();
            alert.sendKeys(text);
        } catch (NoAlertPresentException e) {
            e.printStackTrace();
        }
    }
    public static void switchToFrame(String nameOrId) {
        try {
            Driver.getDriver().switchTo().frame(nameOrId);
        } catch (NoSuchFrameException e) {
            e.printStackTrace();
        }
    }
    public static void switchToFrame(int index) {
        try {
            Driver.getDriver().switchTo().frame(index);
        } catch (NoSuchFrameException e) {
            e.printStackTrace();
        }
    }
    public static void switchToFrame(WebElement element) {
        try {
            Driver.getDriver().switchTo().frame(element);
        } catch (NoSuchFrameException e) {
            e.printStackTrace();
        }
    }
    public static void switchToChildWindow() {
        String mainWindow = Driver.getDriver().getWindowHandle();
        Set<String> handles = Driver.getDriver().getWindowHandles();

        for (String handle : handles) {
            if (!mainWindow.equals(handle)) {
                Driver.getDriver().switchTo().window(handle);
                break;
            }
        }
    }
    public static JavascriptExecutor getJSObject() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        return js;
        // in one line
//		return (JavascriptExecutor) driver;
    }
    public static void jsClick1(WebElement element) {
        getJSObject().executeScript("arguments[0].click();", element);
    }
    public static void scrollToElement1(WebElement element) {
        getJSObject().executeScript("arguments[0].scrollIntoView(true)", element);
    }
    public static void scrollDown(int pixel) {

        getJSObject().executeScript("window.scrollBy(0," + pixel + ")");
    }

    public static void switchToWindow(String targetTitle) {

        String origin = Driver.getDriver().getWindowHandle();
        for (String handle : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(handle);
            if (Driver.getDriver().getTitle().equals(targetTitle)) {
                return;
            }
        }
        Driver.getDriver().switchTo().window(origin);
    }
    public static void scrollUp(int pixel) {
        getJSObject().executeScript("window.scrollBy(0,-" + pixel + ")");
    }
    public static void selectCalendarDate(List<WebElement> elements, String date) {
        for (WebElement day : elements) {
            if (day.isEnabled()) {
                if (day.getText().equals(date)) {
                    day.click();
                    break;
                }
            } else {
                System.out.println("This day is not enabled!");
                break;
            }
        }

    }
    public static String getTimeStamp() {
        Date date = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");

        return sdf.format(date);
    }

    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }

    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            if (!el.getText().isEmpty()) {
                elemTexts.add(el.getText());
            }
        }
        return elemTexts;
    }

    // Explicit Wait methods
    public static void waitForVisibility(WebElement element, int seconds) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(element)));
    }
    public static void waitForVisibility(By locator, int seconds) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOfElementLocated(locator)));
    }
    public static void waitForVisibilityOfMultipleElementsAsList(List<WebElement> list, int seconds) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOfAllElements(list)));
    }
    public static void waitForClickablility(WebElement element, int seconds) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(element)));
    }
    public static void waitForClickablility(By locator, int seconds) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(locator)));
    }
    public static void waitForPresenceOfElementLocated(By locator, int seconds) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(locator)));
    }
    public static void waitForTitleContains(String partOfTitle, int seconds) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.titleContains(partOfTitle)));
    }
    public static void waitForTitleIs(String title, int seconds) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.titleIs(title)));
    }
    public static void waitForUrlContains(String partOfUrl, int seconds) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.urlContains(partOfUrl)));
    }
    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void waitForPageToLoad(int seconds) {
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(seconds));
            wait.until(expectation);
        } catch (Throwable error) {
            System.out.println("Timed out waiting for page load");
        }
    }
    public static WebElement fluentWait(WebElement webElement, int timeOutSeconds, int pollingSeconds) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(Driver.getDriver())
                .withTimeout(Duration.ofSeconds(timeOutSeconds)).pollingEvery(Duration.ofSeconds(pollingSeconds))
                .ignoring(NoSuchElementException.class);
        return wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return webElement;
            }
        });
    }
    public static boolean elementExists(WebElement element, int seconds) {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(seconds));
            wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(element)));
            return true;
        } catch (StaleElementReferenceException | TimeoutException | NoSuchElementException e) {
            return false;
        }
    }
    public static void takeScreenshot(String nameOFFile){
        byte[] screenshotAsFiles = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        try {
            Files.write(Path.of(nameOFFile),screenshotAsFiles);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void scroll(int horizontalAxis, int verticalAxis) {
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("window.scrollBy("+horizontalAxis+","+verticalAxis+")");
    }
    public static void jsClick(WebElement webelement) {
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("arguments[0].click();", webelement);
    }
    public static String getScreenshot(String name)  {
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        String fileName = name + date + ".png";
        String target = System.getProperty("user.dir") + "/target/extentReports/" + fileName;
        File finalDestination = new File(target);
        try {
            FileUtils.copyFile(source, finalDestination);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileName;
    }
    public static void uploadFile(By chooseFileButton, String pathToAFileToBeUploaded ) {
        Driver.getDriver().findElement(chooseFileButton).sendKeys(pathToAFileToBeUploaded);
    }
    public static void jsSendKeys(String cssExpression, String value){
        ((JavascriptExecutor)Driver.getDriver()).executeScript("document.querySelector(\"" + cssExpression+"\").value = \""+value+"\";" );
    }
    public static void scrollToElement( WebElement element){
        int y = element.getLocation().getY();
        ((JavascriptExecutor)Driver.getDriver()).executeScript("window.scrollBy(0,"+ y +")");
    }
}

