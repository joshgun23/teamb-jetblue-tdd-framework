package tests;

import pages.Policies_Page;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Driver;

public class TestPolicyZaur extends TestBase2 {


    @Test
    public void policyWebAccessValidation() throws InterruptedException {

        Policies_Page policypage = new Policies_Page();
        Thread.sleep(3000);
        policypage.webaccess.click();
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Accessibility Information | JetBlue"));
        System.out.println("Web Access page is displayed");
    }


    @Test
    public void policySafetyvalidation() throws InterruptedException {

        Policies_Page policypage = new Policies_Page();
        Thread.sleep(3000);
        policypage.safety.click();
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Safety"));
        System.out.println("Safety page is displayed");
    }


    @Test
    public void policytTarmacValidation() throws InterruptedException {

        Policies_Page policypage = new Policies_Page();
        Thread.sleep(3000);
        policypage.tarmac.click();
        System.out.println(Driver.getDriver().getTitle());
        Assert.assertTrue(Driver.getDriver().getTitle().contains("JetBlue | Airline Tickets, Flights & Airfare"));
        System.out.println("Tarmac page is displayed");
    }

    @Test
    public void policyContractofCarriageValidation() throws InterruptedException {
        Policies_Page policypage = new Policies_Page();
        Thread.sleep(3000);
        policypage.carriage.click();

        if (Driver.getDriver().getTitle().contains("JetBlue | Airline Tickets, Flights & Airfare: Book Direct - Official Site")) {
            System.out.println(Driver.getDriver().getTitle());
            System.out.println("Contract of Carriage page is displayed");

        }
    }

    @Test
    public void policyLegalvalidation() throws InterruptedException {

        Policies_Page policypage = new Policies_Page();
        Thread.sleep(3000);
        policypage.legal.click();
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Legal"));
        System.out.println("Legal page is displayed");
    }

    @Test
    public void policyCustomerServicePlanValidation() throws InterruptedException {

        Policies_Page policypage = new Policies_Page();
        Thread.sleep(3000);
        policypage.customer.click();
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Customer Service Plan"));
        System.out.println("Customer Service Plan page is displayed");






    }

    @Test
    public void policyPrivacyValidation() throws InterruptedException {

        Policies_Page policypage = new Policies_Page();
        Thread.sleep(3000);
        policypage.privacy.click();
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Privacy"));
        System.out.println("Privacy Policy page is displayed");
    }



    @Test
    public void policyHumanTraffickingValidation() throws InterruptedException {

        Policies_Page policypage = new Policies_Page();
        Thread.sleep(3000);
        policypage.humantrafficking.click();
        if (Driver.getDriver().getTitle().contains("Human Trafficking"));
        System.out.println("Human Trafficking page is displayed");
    }

    @Test
    public void policyOptionalServicesValidation() throws InterruptedException {

        Policies_Page policypage = new Policies_Page();
        Thread.sleep(3000);
        policypage.optional.click();
        if (Driver.getDriver().getTitle().contains("Optional Services and Fees"));
        System.out.println("Optional Services and Fees page is displayed");
    }




}


