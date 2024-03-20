package com.acaprogramacionobjetos.acafinalpoo.operativa;

import java.util.Scanner;

public class Pago {

    int limiteSuperior;
    int i;

    public int numeroTicketPago;
    public int codigoReserva;
    public int codigoHuesped;
    public String nombreCliente;
    public String apellidoCliente;
    public String direccionCliente;
    public String telefonoCliente;
    public String concepto;
    public double valorNoche;
    public double subTotal;
    public double nochesReservadas;
    public double costoTotal;

    Scanner sc = new Scanner(System.in);
    int defaultNochesReservadas=1;
    int counter=3;
    public void crearPago() {

        System.out.println("Cuantos pagos desea realizar");
        limiteSuperior=sc.nextInt();

        for(i=1;i<= limiteSuperior;i++){

            //solicitar los datos del pago
            System.out.println("Ingrese los datos de Pago!!");
            System.out.println("\n************************************************************");
            System.out.println("Ingresar el numero de ticket de pago: ");
            numeroTicketPago = sc.nextInt();
            System.out.println("Ingresar el Codigo de reserva: ");
            codigoReserva =  sc.nextInt();
            System.out.println("Ingresar el Codigo de Huesped: ");
            codigoHuesped =  sc.nextInt();
            System.out.println("Ingresar el Nombre del cliente: ");
            nombreCliente =  sc.next();
            System.out.println("Ingresar el Apellido del cliente: ");
            apellidoCliente =  sc.next();
            System.out.println("Ingresar la Direccion del cliente: ");
            direccionCliente =  sc.next();
            System.out.println("Ingresar el telefono del cliente: ");
            telefonoCliente =  sc.next();
            System.out.println("Ingresar el Concepto del pago: ");
            concepto =  sc.next();
            System.out.println("Ingresar el valor por noche: ");
            valorNoche =  sc.nextDouble();

            System.out.println("Ingresar la Cantidad de noches reservadas: ");
            if (nochesReservadas >=defaultNochesReservadas){
                System.out.println("Numero de noches reservadas aceptadas, continue su pago por favor!");
            } else {
                while(counter>0){
                    System.out.println("Por favor ingrese una cantidad valida de noches reservadas!");
                    nochesReservadas = sc.nextDouble();

                    if(nochesReservadas>=defaultNochesReservadas){
                        System.out.println("Numero de noches reservadas aceptadas, continue su pago por favor!");
                        break;
                    }
                    else{
                        counter--;
                    }
                }

            }

            subTotal = valorNoche*nochesReservadas;
            costoTotal =subTotal+(subTotal*0.19);


            //mostrar datos de la reserva
            System.out.println("\nFelicitaciones, se ha generado su pago con exito!!");
            System.out.println("\n************************************************************");
            System.out.println("\nNumero ticket pago : " + codigoReserva);
            System.out.println("\nCodigo Reserva : " + codigoHuesped);
            System.out.println("\nCodigo Huesped : "  + codigoHuesped);
            System.out.println("\nNombre Cliente: " + nombreCliente);
            System.out.println("\nApellido Cliente : "  + apellidoCliente);
            System.out.println("\nDireccion Cliente : "  + direccionCliente);
            System.out.println("\nTelefono Cliente : "  + telefonoCliente);
            System.out.println("\nConcepto Cliente : "  + concepto);
            System.out.println("\nvalor Noche : "  + "$" +  valorNoche);
            System.out.println("\nNoches Reservadas : "  + nochesReservadas);
            System.out.println("\nSubtotal : "  + "$" + subTotal);
            System.out.println("\nIva(19%) : "  + "$" +  subTotal*0.19);
            System.out.println("\nCosto total : "  + "$" +  costoTotal);
            System.out.println("\n************************fin******************************");

        }
        sc.close();


    }
}
