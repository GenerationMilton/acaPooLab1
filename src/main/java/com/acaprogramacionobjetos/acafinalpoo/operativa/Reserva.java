package com.acaprogramacionobjetos.acafinalpoo.operativa;

import java.util.Scanner;

public class Reserva {


    int limiteSuperior;
    int i;

    public String codigoHuesped;
    public String codigoReserva;
    public String codigoHabitacion;
    public String tipoHabitacion;
    public String fechaIngreso;
    public String fechaSalida;
    public int nochesReservadas;
    public int cantidadPersonas;

    Scanner sc = new Scanner(System.in);

    int defaultNochesReservadas=1;
    int defaultPersonas=1;
    int counter=3;
    int counter1=3;


    public void crearReserva() {

        System.out.println("Cuantas reservas desea realizar?");
        limiteSuperior=sc.nextInt();

        for(i=1;i<= limiteSuperior;i++){

            //solicitar los datos al cliente
            System.out.println("Ingrese los datos de la reserva!!");
            System.out.println("Ingresar el Codigo del Huesped: ");
            codigoHuesped = sc.next();
            System.out.println("Ingresar el Codigo del Reserva: ");
            codigoReserva =  sc.next();
            System.out.println("Ingresar el Codigo de la habitacion: ");
            codigoHabitacion = sc.next();
            System.out.println("Ingresar el tipo de la habitacion: ");
            tipoHabitacion = sc.next();
            System.out.println("Ingresar la fecha de ingreso: ");
            fechaIngreso=sc.next();
            System.out.println("Ingresar la fecha de salida: ");
            fechaSalida=sc.next();
            System.out.println("Ingresar las noches reservadas: ");
            nochesReservadas=sc.nextInt();
            if (nochesReservadas >=defaultNochesReservadas){
                System.out.println("Noches reservadas aceptadas, continue su reserva por favor!");
                } else {
                while(counter>0){
                    System.out.println("Por favor ingrese una cantidad valida de noches");
                    nochesReservadas = sc.nextInt();

                    if(nochesReservadas>=defaultNochesReservadas){
                        System.out.println("Noches reservadas aceptadas, continue su reserva por favor!");
                        break;
                    }
                    else{
                        counter--;
                    }
                }

            }
            System.out.println("Ingresar la Cantidad de personas a hospedarse: ");
            if (cantidadPersonas >=defaultPersonas){
                System.out.println("Numero de personas aceptadas, continue su reserva por favor!");
            } else {
                while(counter1>0){
                    System.out.println("Por favor ingrese una cantidad valida de personas");
                    cantidadPersonas = sc.nextInt();

                    if(cantidadPersonas>=defaultPersonas){
                        System.out.println("Numero de personas aceptadas, continue su reserva por favor!");
                        break;
                    }
                    else{
                        counter1--;
                    }
                }

            }

            //mostrar datos de la reserva
            System.out.println("\nFelicitaciones, reserva creado con exito!!");
            System.out.println("\n************************************************************");
            System.out.println("\nCodigo huesped : " + codigoHuesped);
            System.out.println("\nCodigo reserva : " + codigoReserva);
            System.out.println("\nCodigo habitacion : " + codigoHabitacion);
            System.out.println("\nTipo habitacion : "  + tipoHabitacion);
            System.out.println("\nFecha ingreso : "  + fechaIngreso);
            System.out.println("\nFecha Salida : "  + fechaSalida);
            System.out.println("\nNoches Reservadas : "  + nochesReservadas);
            System.out.println("\nCantidad de Personas : "  + cantidadPersonas);
            System.out.println("\n************************fin******************************");

        }
        sc.close();
    }
}
