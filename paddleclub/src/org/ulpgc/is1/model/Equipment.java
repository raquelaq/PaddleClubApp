package org.ulpgc.is1.model;

class Equipment extends Extra {
    public String name;

    public Equipment(int price, String name){
        super(price);
        this.name = name;
    }

    @Override   //buscar qué significa override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
