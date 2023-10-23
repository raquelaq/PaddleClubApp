package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;

import java.lang.reflect.Member;
import static javafx.scene.input.KeyCode.X;

public class Main {
    //i. Init. Crear dos clientes. El primer cliente será miembro del club de paddle.
    //El segundo cliente tendrá el NIF: “12SD34TT4”
    private static void init(PaddleManager cliente) {
        NIF nif1 = new NIF();
        nif1.number = "49496048W";
        cliente.addCustomer("Nombre1", "Apellido1", nif1);
        NIF nif2 = new NIF();
        nif2.number = "12SD34TT4";
        cliente.addCustomer("nombre2", "appellido2", nif2);
    }

    //ii. Init. Crear dos pistas de paddle, una será de tipo rápido y otra de tipo lento.
    private static void init(PaddleManager pista) {
        pista.addCourt("FastCourt", 25, CourtType.FastCourt);
        pista.addCourt("SlowCourt", 25, CourtType.SlowCourt);
    }

    public static void main(String[] args) {

        PaddleManager cliente = new PaddleManager();
        init(cliente);

        PaddleManager pista = new PaddleManager();
        init(pista);

        //iii. Imprimir por pantalla los NIF’s válidos de los clientes del club. (*) En el caso que
        //el cliente tenga un NIF no válido se almacenará el valor: “XXXX”.

        //iv. Imprimir por pantalla los datos del primer cliente.
        System.out.println("Datos del primer cliente:");
        System.out.println(cliente.getCustomerInfo(0));

        //v. Imprimir por pantalla los datos del segundo cliente.
        System.out.println("Datos del segundo cliente:");
        System.out.println(cliente.getCustomerInfo(1));

        //vi. Imprimir por pantalla los datos de la segunda pista.
        System.out.println("Datos de la segunda pista:");
        System.out.println(pista.getCourtInfo(1));

        //vii. Crear una reserva por parte del primer cliente en la segunda pista.


        //viii. Borrar el segundo cliente.
        cliente.removeCustomer(1);

        //ix. Imprimir por pantalla el número de clientes del club.
        System.out.println("Número de clientes del club: " + cliente.getNumberOfCustomers());


        //x. Imprimir por pantalla de todas las reservas realizadas: el nombre del cliente
        //que ha hecho la reserva, el nombre de la pista, el día y el coste de dicha
        //reserva
    }
}