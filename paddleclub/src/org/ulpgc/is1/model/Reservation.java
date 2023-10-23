package org.ulpgc.is1.model;

import java.util.Date;


public class Reservation {
    private static final int NEXT_ID = 0;

    public Date date;

    private final int id;

    public Reservation() {
        this.date = date;
        this.id = NEXT_ID++;
    }

    public Date getDate() {
        return date;
    }

    public int getId() {
        return id;
    }
}
