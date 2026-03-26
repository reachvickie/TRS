/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vit.devops.macse639.ticketreservation;

/**
 *
 * @author Vignesh A
 */
public class RailwayDatabase {

    private int id;
    private String response;

    public RailwayDatabase(int id, String response) {
        this.id = id;
        this.response = response;
    }

    public void connectDatabase() {
        System.out.println("Database connected.");
    }

    public void getResponse() {
        System.out.println("Response: " + response);
    }
}