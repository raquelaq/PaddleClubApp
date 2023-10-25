package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaddleManager {

    public List<Customer> customers = new ArrayList<>();
    public List<Court> courts = new ArrayList<>();

    private final List<String> validNIFs = new ArrayList<>();

    private final List<Reservation> reservations = new ArrayList<>();

    public PaddleManager() {
    }

    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }

    public void addCourt(Court court) {
        this.courts.add(court);
    }

    public Customer getCustomer(int index) {
        return this.customers.get(index);
    }

    public Court getCourt(int index) {
        return this.courts.get(index);
    }

    public void reserve(int id, Customer customer, Court court, Date date) {
        Reservation reservation = new Reservation(id, date, court, customer);
        customer.addReservation(reservation);
        court.addReservation(reservation);
    }

    public String getCustomerInfo(int index) {
        if (index >= 0 && index < this.customers.size()) {
            Customer customer = this.customers.get(index);
            String memberStatus = customer instanceof Member ? "Miembro del club" : "No miembro del club";
            String var10000 = customer.getName();
            return "- Nombre: " + var10000 + "\n- Apellido: " + customer.getSurname() + "\n- NIF: " + customer.getNif().number + "\n- Estado del club: " + memberStatus;
        } else {
            return "Índice de cliente no válido";
        }
    }

    public String getCourtInfo(int index) {
        if (index >= 0 && index < this.courts.size()) {
            Court court = this.courts.get(index);
            String var10000 = court.getName();
            return "- Nombre de la pista: " + var10000 + "\n- Precio de la pista: " + court.getPrice() + " euros\n- Tipo de pista: " + court.getCourtType();
        } else {
            return "Índice de la pista no válido";
        }
    }

    public void removeCustomer(int index) {
        if (index >= 0 && index < this.customers.size()) {
            this.customers.remove(index);
            System.out.println("Cliente eliminado correctamente.");
        } else {
            System.out.println("Índice de cliente no válido. No se pudo eliminar el cliente.");
        }

    }

    public void storeValidNIFs() {
        for (Customer customer : customers) {
            if (customer.getNif().isValid()) {
                validNIFs.add(customer.getNif().number);
            } else {
                validNIFs.add("XXXX");
            }
        }
    }

    public void printValidNIFs() {
        System.out.println("NIF’s válidos de los clientes del club:");
        for (String nif : validNIFs) {
            System.out.println(nif);
        }
    }

    public Reservation addReservation(Customer customer, Court court, Date date) {
        Reservation reservation = new Reservation(Reservation.getNextId(), date, court, customer);
        reservations.add(reservation);
        return reservation;
    }

}
