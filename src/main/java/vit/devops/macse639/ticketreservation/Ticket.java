/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vit.devops.macse639.ticketreservation;

/**
 *
 * @author Vignesh A
 */
public class Ticket {

    private int ticketNo;
    private String startingLocation;
    private String destinationLocation;
    private int passengerNo;

    public Ticket(int ticketNo, String start, String dest, int passengerNo) {
        this.ticketNo = ticketNo;
        this.startingLocation = start;
        this.destinationLocation = dest;
        this.passengerNo = passengerNo;
    }

    public void paymentAmount() {
        System.out.println("Calculating payment...");
    }

    public void cancelTicket() {
        System.out.println("Ticket Cancelled");
    }

    public int getTicketNo() {
        return ticketNo;
    }
}
