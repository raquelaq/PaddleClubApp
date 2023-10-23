package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class PaddleManager {

    private List<Court> courtList;
    private List<Customer> customerList;

    public PaddleManager(){
        this.courtList = new ArrayList<>();
    }

    public void addCustomer(String name, String surname, NIF nif) {

        Customer customer = new Customer(name, surname, nif);
        customerList.add(customer);
    }

    public void addCourt(String name, int price, Enum CourtType) {

        Court court = new Court(name, price, CourtType);
        courtList.add(court);
    }

    public Customer getCustomer(int index){
        return customerList.get(index);
    }
    public Court getCourt(int index){
        return courtList.get(index);
    }


    public boolean getCustomerInfo(int i) {
        return false;
    }

    public boolean getCourtInfo(int i) {
        return false;
    }

    public void removeCustomer(int i) {
    }

    public String getNumberOfCustomers() {
        return null;
    }
}
