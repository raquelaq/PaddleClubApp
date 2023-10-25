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

        System.out.println("Reserva creada correctamente.");
        System.out.println("Datos de la reserva");
        System.out.println("- Reserva ID: " + id);
        System.out.println("- Fecha y hora: " + formattedDate);
        System.out.println("- Cliente: " + customer.getName() + " " + customer.getSurname());
        System.out.println("- Pista: " + court.getName());
    }



    public double price() {
        double basePrice;
        if (court.isFastCourt()) {
            basePrice = 25;
        } else {
            basePrice = 20;
        }

        if (customer instanceof Member) {
            // Si es miembro del club, aplicar descuento
            if (court.isFastCourt()) {
                basePrice = 22.5;
            } else {
                basePrice = 18.5;
            }
        }

        return basePrice;
    }

    public void printReservationDetailsPrice() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String formattedDate = sdf.format(date);

        System.out.println("Detalles de la reserva:");
        System.out.println("- Reserva ID: " + id);
        System.out.println("- Fecha y hora: " + formattedDate);
        System.out.println("- Cliente: " + customer.getName() + " " + customer.getSurname());
        System.out.println("- Pista: " + court.getName());
        System.out.println("- Precio: " + court.getPrice() + " euros");
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
