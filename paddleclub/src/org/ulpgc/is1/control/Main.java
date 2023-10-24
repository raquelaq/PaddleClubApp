package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;
import java.util.*;

import static javafx.scene.input.KeyCode.X;

public class Main {

    public static void main(String[] args) {
        PaddleManager manager = new PaddleManager();
        init(manager);
        System.out.println("Datos del primer cliente:");
        System.out.println(manager.getCustomerInfo(0));
        System.out.println("--------------------------------------------");
        System.out.println("Datos del segundo cliente:");
        System.out.println(manager.getCustomerInfo(1));
        System.out.println("--------------------------------------------");
        manager.storeValidNIFs();
        manager.printValidNIFs();
        System.out.println("--------------------------------------------");
        System.out.println("Datos de la segunda pista:");
        System.out.println(manager.getCourtInfo(1));
        System.out.println("--------------------------------------------");
        Customer firstCustomer = manager.customers.get(0);
        Court secondCourt = manager.courts.get(1);
        Date reservationDate = new Date();
        Reservation reservation = manager.addReservation(firstCustomer, secondCourt, reservationDate);
        manager.addReservation(firstCustomer, secondCourt, reservationDate);
        if (reservation != null) {
            reservation.printReservationDetails();
        } else {
            System.out.println("Error al crear la reserva.");
        }        System.out.println("--------------------------------------------");
        manager.removeCustomer(1);
        System.out.println("Número de clientes del club: " + manager.customers.size());


    }

    private static void init(PaddleManager manager) {
        NIF nif1 = new NIF();
        nif1.number = "49498496N";
        Address address = new Address("Felo Monzón", 26, 35019, "Las Palmas de Gran Canaria");
        org.ulpgc.is1.model.Member member = new Member("Jorge", "Morales", nif1, 100, address);
        manager.addCustomer(member);
        NIF nif2 = new NIF();
        nif2.number = "12SD34TT4";
        Customer customer = new Customer("Raquel", "Almeida", nif2);
        manager.addCustomer(customer);
        Court fastCourt = new Court("Fast Court", 25, CourtType.FastCourt);
        Court slowCourt = new Court("Slow Court", 20, CourtType.SlowCourt);
        manager.addCourt(fastCourt);
        manager.addCourt(slowCourt);

    }
}