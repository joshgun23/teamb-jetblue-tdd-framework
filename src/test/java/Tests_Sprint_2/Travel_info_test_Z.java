package Tests_Sprint_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import tests.TestBase2;
import utils.Driver;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class Travel_info_test_Z extends TestBase2 {


    @Test
        public void Travel_info_test_Z() {


        pages_Sprint_2.Travel_info_Z travelInfoButton = new pages_Sprint_2.Travel_info_Z();
        travelInfoButton.travelInfo.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertEquals(Driver.getDriver().getTitle(),"Travel Info | JetBlue");

    }
    @Test
    public void Travel_group(){
        pages_Sprint_2.Travel_info_Z groupTravelButton = new pages_Sprint_2.Travel_info_Z();
        groupTravelButton.groupTravel.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertEquals(Driver.getDriver().getTitle(),"Group Travel | JetBlue");

    }
    @Test
    public void Travel_leisure(){
        pages_Sprint_2.Travel_info_Z leisureGroupButton = new pages_Sprint_2.Travel_info_Z();
        leisureGroupButton.leisureGroup.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertEquals(Driver.getDriver().getTitle(),"Leisure Group Travel | JetBlue");

    }
    @Test
    public void Travel_incentive(){
        pages_Sprint_2.Travel_info_Z incentiveGroupButton = new pages_Sprint_2.Travel_info_Z();
        incentiveGroupButton.incentiveGroup.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertEquals(Driver.getDriver().getTitle(),"Incentive Group Travel | JetBlue");

    }
    @Test
    public void Travel_meeting(){
        pages_Sprint_2.Travel_info_Z meetingGroupButton = new pages_Sprint_2.Travel_info_Z();
        meetingGroupButton.meetingGroup.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertEquals(Driver.getDriver().getTitle(),"Meeting Group Travel | JetBlue");

    }
     @Test
    public void contactInformation() throws IOException {
         // 1. Read the file
         Path reader = Path.of("data.csv");
         List<String[]> dataRows = Files.readAllLines(reader) // read all lines from file
                 .stream() // convert to stream
                 .skip(1) // skip the header row
                 .map(line -> line.split(",")) // split each line by comma
                 .collect(Collectors.toList()); // collect into a list of String arrays

         // Get a random row of data from the list
         Random random = new Random();
         String[] randomDataRow = dataRows.get(random.nextInt(dataRows.size()));

         // Use the data from the row to enter customer information
            pages_Sprint_2.Travel_info_Z fullName = new pages_Sprint_2.Travel_info_Z();
            fullName.fullName.sendKeys(randomDataRow[0]);
            pages_Sprint_2.Travel_info_Z email = new pages_Sprint_2.Travel_info_Z();
            email.email.sendKeys(randomDataRow[1]);
            pages_Sprint_2.Travel_info_Z phone = new pages_Sprint_2.Travel_info_Z();
            phone.phone.sendKeys(randomDataRow[2]);
            pages_Sprint_2.Travel_info_Z alternatePhone = new pages_Sprint_2.Travel_info_Z();
            alternatePhone.alternatePhone.sendKeys(randomDataRow[3]);



     }
     }




