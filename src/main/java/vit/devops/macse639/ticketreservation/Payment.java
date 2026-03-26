/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vit.devops.macse639.ticketreservation;

/**
 *
 * @author Vignesh A
 */

public class Payment {

    private double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public void makePayment() {
        System.out.println("Payment of " + amount + " successful.");
    }
}