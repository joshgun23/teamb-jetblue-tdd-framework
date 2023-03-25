package tests;
import org.testng.annotations.Test;
import pages.*;

//import static utils.Driver;

public class FlightBooking_Z extends TestBase2{
    @Test (priority = 1 ,enabled = false)
    public void bookFlight()  {
        HomePage_Z homePage = new HomePage_Z();
        homePage.selectOneWay();
        homePage.enterOrigin("JFK");
        homePage.enterDestination("LAX");
        homePage.selectDepartureDate("2023-04-01");
        homePage.selectPassengers(1, 0, 0);
        homePage.clickSearchButton();

        FlightsPage_Z flightsPage = new FlightsPage_Z();
        flightsPage.selectFlight(0);


        FlightDetailsPage_Z flightDetailsPage = new FlightDetailsPage_Z();
        flightDetailsPage.clickContinueButton();

        PassengerDetailsPage_Z passengerDetailsPage = new PassengerDetailsPage_Z();
        passengerDetailsPage.enterPassengerDetails("John", "Doe", "male", "1990-01-01");
        passengerDetailsPage.clickContinueButton();

        PaymentPage_Z paymentPage = new PaymentPage_Z();
        paymentPage.enterPaymentDetails("1234567890123456", "12/25", "123");
        paymentPage.clickSubmitButton();

        ConfirmationPage_Z confirmationPage = new ConfirmationPage_Z();
        confirmationPage.verifyConfirmationPage();
    }
}
