package com.acaprogramacionobjetos.acafinalpoo.funcional;

import com.acaprogramacionobjetos.acafinalpoo.operativa.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class AcafinalpooApplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a, limiteSuperior, op;
		System.out.println("Bienvenidos al hotel: ");
		System.out.println("\n************************************************************");
		System.out.println("M   M  FFFFF");
		System.out.println("MM MM  F    ");
		System.out.println("M M M  F    ");
		System.out.println("M   M  FFF  ");
		System.out.println("M   M  F    ");
		System.out.println("M   M  F    ");
		System.out.println("M   M  F    ");
		System.out.println("\n************************************************************");
		System.out.println("\n************************************************************");
		System.out.println("\nmenu disponible");

		System.out.println("\n1. Ver datos hotel");

		System.out.println("\n2 Crear habitacion");

		System.out.println("\n3 Crear clientes");

		System.out.println("\n4 Crear Reserva");

		System.out.println("\n5 Registro huespedes");

		System.out.println("\n6 Registro de pago ");
		System.out.println("\n************************************************************");

		op =sc.nextInt();


		if(op ==1){
			Hotel hotel = new Hotel();
			hotel.datosHotel();
			hotel.mostrarDatosHotel();
		}

		if(op==2){
			Habitacion habitacion = new Habitacion();
			habitacion.crearHabitacion();

		}

		if(op==3){

			Cliente cliente = new Cliente();
			cliente.crearCliente();

		}

		if(op==4){

			Reserva reserva = new Reserva();
			reserva.crearReserva();

		}
		if(op==5){
			RegistroHuespedes registroHuespedes = new RegistroHuespedes();
			registroHuespedes.crearRegistroHuespedes();
		}

		if(op==6){
			Pago pago = new Pago();
			pago.crearPago();
		}

	}





}
