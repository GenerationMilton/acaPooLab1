package com.acaprogramacionobjetos.acafinalpoo.operativa;

import java.util.Scanner;

public class RegistroHuespedes {

    int limiteSuperior;
    int i;

    public String codigoReserva;
    public String codigoHuesped;
    public int cantidadPersonas;
    public String tipoHabitacion;
    public String fechaLlegada;
    public String fechaSalida;

    Scanner sc = new Scanner(System.in);
    int defaultPersonas=1;
    int counter=3;

    public void crearRegistroHuespedes() {

        System.out.println("Cuantos Huespedes desea registrar?");
        limiteSuperior=sc.nextInt();

        for(i=1;i<= limiteSuperior;i++){

            //solicitar los datos al cliente
            System.out.println("Ingrese los datos del registro de huespedes!!");
            System.out.println("Ingresar el Codigo de la reserva: ");
            codigoReserva = sc.next();
            System.out.println("Ingresar el Codigo del huesped: ");
            codigoHuesped =  sc.next();

            System.out.println("Ingresar la Cantidad de personas a registrarse: ");
            if (cantidadPersonas >=defaultPersonas){
                System.out.println("Numero de personas aceptadas, continue su registro de huespedes por favor!");
            } else {
                while(counter>0){
                    System.out.println("Por favor ingrese una cantidad valida de personas!");
                    cantidadPersonas = sc.nextInt();

                    if(cantidadPersonas>=defaultPersonas){
                        System.out.println("Numero de personas aceptadas, continue su registro de huespedes por favor!");
                        break;
                    }
                    else{
                        counter--;
                    }
                }

            }
            System.out.println("Ingresar el tipo de habitacion: ");
            tipoHabitacion=sc.next();
            System.out.println("Ingresar la fecha de ingreso: ");
            fechaLlegada=sc.next();
            System.out.println("Ingresar la fecha de llegada: ");
            fechaSalida=sc.next();

            //mostrar datos de la reserva
            System.out.println("\nFelicitaciones, registro de huespedes creado con exito!!");
            System.out.println("\n************************************************************");
            System.out.println("\nCodigo Reserva : " + codigoReserva);
            System.out.println("\nCodigo Huesped : " + codigoHuesped);
            System.out.println("\nCantidad de Personas : "  + cantidadPersonas);
            System.out.println("\nTipo Habitacion : " + tipoHabitacion);
            System.out.println("\nFecha Llegada : "  + fechaLlegada);
            System.out.println("\nFecha Salida : "  + fechaSalida);
            System.out.println("\n************************fin******************************");

        }
        sc.close();


    }
}
