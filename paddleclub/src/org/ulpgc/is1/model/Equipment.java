package org.ulpgc.is1.model;

class Equipment extends Extra {
    public String name;

    public Equipment(String name, int price) {
        super();
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
