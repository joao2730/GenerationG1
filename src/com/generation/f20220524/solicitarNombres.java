package com.generation.f20220524;

import java.util.Scanner;

public class solicitarNombres {

    public static void main(String[] args) {

        /*
         * solicitar todos los string
         * nombre apellido direccion
         * edad, numero de direccion
         * saldo ($) minimo 50.000
         *
         * Mayotia de edad
         * validar el saldo, no puede realizar apuestas
         *
         * cuanto apostara, minimo de apuesta 10.000
         */

        //variables
        int mayoriaEdad = 18;
        int saldoMinimo = 50000;
        int apuestaMinima = 10000;

        Scanner sc = new Scanner(System.in);

        //Edad ingresada
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();

        if (edad <= mayoriaEdad) {
            System.out.println("Usted no tiene permitido el ingreso");
        } else {

            //nombre
            System.out.println("Ingrese su nombre: ");
            String nombre = sc.nextLine();

            //apellido
            System.out.println("Ingrese su apellido: ");
            String apellido = sc.nextLine();

            //Numero de direccion
            System.out.println("Ingrese su numero de direccion: ");
            int numeroDeDireccion = sc.nextInt();

            //Saldo
            System.out.println("Ingrese su saldo actual sin puntos: ");
            int saldo = sc.nextInt();

            //condicionales mayoriaEdad y saldo minimo
            if (saldo >= saldoMinimo) {
                System.out.println("Usted cumple la mayoria de edad y su saldo es suficiente, puede ingresar");
                System.out.println("Cuanto quieres apostar? (requisito minimo $10000");



            }


        }

    }
}