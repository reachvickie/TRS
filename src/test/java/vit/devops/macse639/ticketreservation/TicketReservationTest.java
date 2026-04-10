package vit.devops.macse639.ticketreservation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TicketReservationTest {

    @Test
    public void testSearchTrains() {
        Passenger passenger = new Passenger("Vignesh", 22, "Chennai");
        passenger.searchTrains();
        assertNotNull(passenger);
    }

    @Test
    public void testDisplayTrain() {
        Train train = new Train("Express", 101);
        train.displayTrain();
        assertNotNull(train);
    }

    @Test
    public void testTicketPayment() {
        Ticket ticket = new Ticket(1001, "Chennai", "Bangalore", 1);
        ticket.paymentAmount();
        assertNotNull(ticket);
    }

    @Test
    public void testPayment() {
        Payment payment = new Payment(500);
        payment.makePayment();
        assertNotNull(payment);
    }

    @Test
    public void testDatabaseConnection() {
        RailwayDatabase db = new RailwayDatabase(1, "Success");
        db.connectDatabase();
        assertNotNull(db);
    }
}