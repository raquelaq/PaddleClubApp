package org.ulpgc.is1.model;

import java.util.List;

public class Customer {

    public String name;
    public String surname;
    public NIF nif;

    public Customer(String name, String surname, NIF nif){
        this.name = name;
        this.surname = surname;
        this.nif = new NIF();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public NIF getNif() {
        return nif;
    }}
