package org.ulpgc.is1.model;
 public class Member extends Customer {
     public int points;
     Address address;

     public Member(String name, String surname, NIF nif, int points, Address address) {
         super(name, surname, nif);
         this.points = points;
         this.address = address;
     }

     public int getPoints() {
         return this.points;
     }

     public Address getAddress() {
         return this.address;
     }

     public void setPoints(int points) {
         this.points = points;
     }

     public void setAddress(Address address) {
         this.address = address;
     }
}
