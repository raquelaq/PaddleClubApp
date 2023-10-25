package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    public String name;
    public String surname;
    public NIF nif;
    public List<Reservation> reservations = new ArrayList<>();

    public Customer(String name, String surname, NIF nif) {
        this.name = name;
        this.surname = surname;
        this.nif = nif;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public NIF getNif() {
        return this.nif;
    }

    public void setNif(NIF nif) {
        this.nif = nif;
    }

    public void addReservation(Reservation reservation) {
        this.reservations.add(reservation);
    }
}
