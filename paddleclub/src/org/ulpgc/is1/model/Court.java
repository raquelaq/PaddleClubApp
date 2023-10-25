package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Court {

    public String name;
    public int price;
    public CourtType courtType;
    public List<Reservation> reservations = new ArrayList<>();


    public Court(String name, int price, CourtType courtType) {
        this.name = name;
        this.price = price;
        this.courtType = courtType;
    }

    public CourtType getCourtType() {

        return this.courtType;
    }

    public boolean isFastCourt() {
        return this.courtType == CourtType.FastCourt;
    }

    public void setCourtType(CourtType courtType) {
        this.courtType = courtType;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void addReservation(Reservation reservation) {
        this.reservations.add(reservation);
    }

}
