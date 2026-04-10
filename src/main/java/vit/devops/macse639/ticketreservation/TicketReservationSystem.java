package vit.devops.macse639.ticketreservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TicketReservationSystem {

    public static void main(String[] args) {
        SpringApplication.run(TicketReservationSystem.class, args);
    }

    @GetMapping("/")
    public String runSystem() {

        Passenger passenger = new Passenger("Vignesh A", 22, "Chennai");
        Train train = new Train("Express", 101);
        Ticket ticket = new Ticket(1001, "Chennai", "Bangalore", 1);
        Payment payment = new Payment(500);
        TicketClerk clerk = new TicketClerk("Ravi", "Station A");
        RailwayDatabase db = new RailwayDatabase(1, "Success");

        passenger.searchTrains();
        train.displayTrain();
        passenger.reserveSeat();

        ticket.paymentAmount();
        payment.makePayment();

        clerk.reserveTicket();
        db.connectDatabase();

        return "Ticket Reservation System Executed Successfully for the second time";
    }
}