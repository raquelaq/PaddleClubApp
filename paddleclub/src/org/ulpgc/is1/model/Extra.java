package org.ulpgc.is1.model;

abstract class Extra {
    public int price;
    public Extra(int price){
        this.price = price;
    }

    public String getName() {
        return null; //comprobar lo que tiene que devolver
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
}
