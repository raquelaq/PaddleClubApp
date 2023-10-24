package org.ulpgc.is1.model;

class Umpire extends Extra {
    public String name;
    public String surname;

    public Umpire(String name, String surname, int price) {
        super(price);
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name + " " + this.surname;
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
}
