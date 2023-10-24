package org.ulpgc.is1.model;

abstract class Extra {
    public int price;

    public Extra(int price) {
        this.price = price;
    }

    public Extra() {

    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract String getName();
}
