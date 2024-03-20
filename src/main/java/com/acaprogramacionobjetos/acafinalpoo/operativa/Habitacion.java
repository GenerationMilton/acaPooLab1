package com.acaprogramacionobjetos.acafinalpoo.operativa;

import java.util.Scanner;

public class Habitacion {

    Scanner sc = new Scanner(System.in);

    int a, limiteSuperior;

    //String codigo;
    int codigo;
    String caracteristicas;
    String tipoHabitacion;
    String numeroHabitacion;
    int precio;
    int numeroPiso;

    public void crearHabitacion(){
        System.out.println("Cuantas habitaciones desea crear?");
        limiteSuperior=sc.nextInt();

        for(a=1;a<= limiteSuperior;a++){

            //solicitar los datos al usuario
            System.out.println("Ingresar codigo de la habitacion: ");
            codigo = sc.nextInt();
            System.out.println("Ingresar caracteristicas de la habitacion: ");
            caracteristicas = sc.next();
            System.out.println("Ingresar el tipo de habitacion: ");
            tipoHabitacion =  sc.next();
            System.out.println("Ingresar el numero de habitacion: ");
            numeroHabitacion =  sc.next();
            System.out.println("Ingresar el precio: ");
            precio = sc.nextInt();
            System.out.println("Ingresar el numero de piso: ");
            numeroPiso = sc.nextInt();

            //mostrar datos habitaion
            System.out.println("\nFelicitaciones, habitacion creada con exito!!");
            System.out.println("\n************************************************************");
            System.out.println("\nCodigo habitacion: "+ codigo);
            System.out.println("\nCaracteristicas habitacion: "+ caracteristicas);
            System.out.println("\nTipo de habitacion: "+tipoHabitacion);
            System.out.println("\nNumero de habitacion: " + numeroHabitacion);
            System.out.println("\nPrecio de la habitacion: " + precio);
            System.out.println("\nNumero de piso: " + numeroPiso);
            System.out.println("\nNumero de habitacion: " + numeroHabitacion);
            System.out.println("\n************************fin******************************");

        }
        sc.close();

    }




}
