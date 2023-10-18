package org.ulpgc.is1.model;
 class Member extends Customer {
    public int points;
    public Member(String name, String surname, NIF nif){
        super(name, surname, nif);
    }

    public int getPoints(){
        return points;
    }

    public void setPoints(int points){
        this.points = points;
    }
}
