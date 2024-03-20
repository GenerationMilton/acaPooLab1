package com.acaprogramacionobjetos.acafinalpoo.operativa;

import javax.swing.*;
import java.util.Scanner;

public class Cliente {


    public int codigoCliente;

    public String nombre;

    public String apellido;
    public String direccion;

    public int i;
    public int limiteSuperior;

    Scanner sc = new Scanner(System.in);


    public void crearCliente(){
        System.out.println("Cuantos clientes se desean hospedar?");
        limiteSuperior=sc.nextInt();

        for(i=1;i<= limiteSuperior;i++){

            //solicitar los datos al cliente
            System.out.println("Ingresar el nombre del cliente a hospedarse: ");
            nombre = sc.next();
            System.out.println("Ingresar el apellido del cliente a hospedarse: ");
            apellido =  sc.next();
            System.out.println("Ingresar el codigo del cliente a hospedarse: ");
            codigoCliente = sc.nextInt();
            System.out.println("Ingresar la direccion del cliente a hospedarse: ");
            direccion = sc.next();


            //mostrar datos cliente
            System.out.println("\nFelicitaciones, cliente creado con exito!!");
            System.out.println("\n************************************************************");
            System.out.println("\nNombre cliente: " + nombre);
            System.out.println("\nAppellido cliente: " + apellido);
            System.out.println("\nCodigo cliente: " + codigoCliente);
            System.out.println("\nDireccion cliente: "  + direccion);
            System.out.println("\n************************fin******************************");

        }
        sc.close();
    }
}
