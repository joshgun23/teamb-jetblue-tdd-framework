package tests;

import Pages.JetBlueHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utils.Driver;

import java.time.Duration;

public class FlightsHotel extends TestBase {


    @Test(priority = 1, groups = {"smoke"})

    public void testFlightsHotel() {
        JetBlueHomePage jetBlueHomePage = new JetBlueHomePage();
        jetBlueHomePage.getFromOriginButton().sendKeys("New York");
    }
}
