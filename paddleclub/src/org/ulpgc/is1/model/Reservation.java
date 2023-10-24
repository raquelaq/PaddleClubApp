package org.ulpgc.is1.model;

import java.util.Date;
import java.text.SimpleDateFormat;


public class Reservation {
    private static int NEXT_ID;
    private final int id;
    public Date date;
    public Customer customer;
    public Court court;

    public Reservation(int id, Date date, Court court, Customer customer) {
        this.id = NEXT_ID++;
        this.date = date;
        this.court = court;
        this.customer = customer;
    }

    public void printReservationDetails() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String formattedDate = sdf.format(date);

        System.out.println("Reserva ID: " + id);
        System.out.println("Fecha y hora: " + formattedDate);
        System.out.println("Cliente: " + customer.getName() + " " + customer.getSurname());
        System.out.println("Pista: " + court.getName());
    }

    public static int getNextId() {
        return NEXT_ID;
    }

    public static void setNextId(int nextId) {
        NEXT_ID = nextId;
    }

    public int getId() {
        return this.id;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
