package org.ulpgc.is1.model;

class Umpire extends Extra {
    public String name;
    public String surname;

    public Umpire(int price, String name, String surname){
        super(price);
        this.name = name;
        this.surname = surname;
    }

    @Override
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
}
