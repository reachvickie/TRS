/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vit.devops.macse639.ticketreservation;

/**
 *
 * @author Vignesh A
 */

public class TicketClerk {

    private String name;
    private String location;

    public TicketClerk(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void reserveSeat() {
        System.out.println("Seat reserved by clerk.");
    }

    public void reserveTicket() {
        System.out.println("Ticket reserved.");
    }

    public void cancelTicket() {
        System.out.println("Ticket cancelled by clerk.");
    }

    public void receivePayment() {
        System.out.println("Payment received.");
    }
}
