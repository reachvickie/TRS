/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vit.devops.macse639.ticketreservation;
/**
 *
 * @author Vignesh A
 */
public class Passenger {

    private String name;
    private int age;
    private String address;

    public Passenger(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void searchTrains() {
        System.out.println("Searching trains...");
    }

    public void viewSchedule() {
        System.out.println("Viewing schedule...");
    }
    
    public void reserveSeat() {
        System.out.println("Seat reserved.");
    }

    public void purchaseTicket() {
        System.out.println("Ticket purchased.");
    }

    public void cancelTicket() {
        System.out.println("Ticket cancelled.");
    }

    public void makePayment() {
        System.out.println("Payment done.");
    }

    public String getName() {
        return name;
    }

 
}
