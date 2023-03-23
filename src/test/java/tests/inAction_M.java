package tests;

import pages.InAction_Page_M;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Driver;

public class inAction_M extends TestBase2 {



@Test
      public void JetBlueForGood() throws InterruptedException {



          InAction_Page_M inAct = new InAction_Page_M();
          Thread.sleep(1000);
          inAct.ForGood.click();

     Assert.assertEquals(Driver.getDriver().getTitle(),"JetBlue For Good | JetBlue");
          System.out.println(Driver.getDriver().getTitle());
         // System.out.println(" JetBlue For Good page is displayed");
      }




        @Test
        public void Sustainability() throws InterruptedException {

            InAction_Page_M inAct = new InAction_Page_M();
            Thread.sleep(1000);
            inAct.sustain.click();

            if(Driver.getDriver().getTitle().contains("JetBlue | Sustainable"))
            System.out.println(Driver.getDriver().getTitle());
            System.out.println("Sustainable page is displayed");
        }


        @Test
        public void Diversity_Equity_Inclusion() throws InterruptedException {

            InAction_Page_M inAct = new InAction_Page_M();
            Thread.sleep(1000);
            inAct.inclusion.click();

            if(Driver.getDriver().getTitle().contains("JetBlue | Diversity, Equity & Inclusion "));
            System.out.println(Driver.getDriver().getTitle());
            System.out.println("Diver_Equity_Inclusion page is displayed");
        }

        @Test
        public void Military() throws InterruptedException {


            InAction_Page_M inAct = new InAction_Page_M();
            Thread.sleep(1000);
            inAct.military.click();

            if (Driver.getDriver().getTitle().contains("JetBlue | Military Customers")) {
                System.out.println(Driver.getDriver().getTitle());
                System.out.println("Military page is displayed");

            }
        }


    }



