package com.acaprogramacionobjetos.acafinalpoo.operativa;

import java.util.Scanner;

public class Hotel {

    String nombreHotel;

    String nit;

    String paginaWeb;
    String correo;
    String ciudad;
    String direccion;
    String sucursal;
    int telefono;
    int capacidad;

    Scanner sc = new Scanner(System.in);


    public void datosHotel(){
        nombreHotel="Hotel Mis Fantasias";
        nit="1030532435-6";
        paginaWeb="www.misfantasias.com";
        correo="bogota";
        sucursal="bogota";
        direccion= "carrera 54A N54B 30 sur";
        telefono=7852929;
        capacidad=1000;


    }

    public void mostrarDatosHotel(){
        System.out.println("\n************************************************************");
        System.out.println("nombre hotel:" + nombreHotel);
        System.out.println("Nit: " + nit);
        System.out.println("Pagina: " + paginaWeb);
        System.out.println("Correo: "  + correo);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Sucursal: " + sucursal);
        System.out.println("Direccion: " + direccion);
        System.out.println("Telfono: " + telefono);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("\n************************fin******************************");
    }



}
