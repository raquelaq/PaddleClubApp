package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        PaddleManager manager = new PaddleManager();
        init(manager);
        // Imprimir NIF's válidos clientes. Si no lo son, imprimir "XXXX"
        manager.storeValidNIFs();
        manager.printValidNIFs();
        System.out.println("--------------------------------------------");

        // Imprimir datos primer cliente
        System.out.println("Datos del primer cliente:");
        System.out.println(manager.getCustomerInfo(0));
        System.out.println("--------------------------------------------");

        // Imprimir datos segundo cliente
        System.out.println("Datos del segundo cliente:");
        System.out.println(manager.getCustomerInfo(1));
        System.out.println("--------------------------------------------");

        // Imprimir datos segunda pista
        System.out.println("Datos de la segunda pista:");
        System.out.println(manager.getCourtInfo(1));
        System.out.println("--------------------------------------------");

        // Crear reserva por parte del primer cliente en la segunda pista
        Customer firstCustomer = manager.customers.get(0);
        Court secondCourt = manager.courts.get(1);
        Date reservationDate = new Date();
        Reservation reservation = manager.addReservation(firstCustomer, secondCourt, reservationDate);
        manager.addReservation(firstCustomer, secondCourt, reservationDate);
        if (reservation != null) {
            reservation.printReservationDetails();
        } else {
            System.out.println("Error al crear la reserva.");
        }
        System.out.println("--------------------------------------------");

        // Borrar el segundo cliente
        manager.removeCustomer(1);
        System.out.println("--------------------------------------------");


        // Imprimir por pantalla el numero de clientes del club
        System.out.println("Número de clientes del club: " + manager.customers.size());
        System.out.println("--------------------------------------------");

        /*Imprimir todas las reservas realizadas: el nombre del cliente
        que ha hecho la reserva, el nombre de la pista, el día y el coste de dicha
        reserva*/
        if (reservation != null) {
            reservation.printReservationDetailsPrice();
        }


    }

    private static void init(PaddleManager manager) {
        // Creación dos clientes. El primero será miembro del club. El segundo tendrá como NIF: 12SD34TT4
        NIF nif1 = new NIF();
        nif1.number = "49498496N";
        Address address = new Address("Felo Monzón", 26, 35019, "Las Palmas de Gran Canaria");
        org.ulpgc.is1.model.Member member = new Member("Jorge", "Morales", nif1, 100, address);
        manager.addCustomer(member);
        NIF nif2 = new NIF();
        nif2.number = "12SD34TT4";
        Customer customer = new Customer("Raquel", "Almeida", nif2);
        manager.addCustomer(customer);
        // Creación dos pistas de paddle, una tipo rápido y otra tipo lento
        Court fastCourt = new Court("Fast Court", 25, CourtType.FastCourt);
        Court slowCourt = new Court("Slow Court", 20, CourtType.SlowCourt);
        manager.addCourt(fastCourt);
        manager.addCourt(slowCourt);

    }
}