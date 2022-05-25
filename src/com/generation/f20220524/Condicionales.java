package com.generation.f20220524;

import java.util.Scanner;

public class Condicionales {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //capturar el ingreso por consola
        // validar la mayoria de edad
        //estabecer punto critico -->18 años

        int mayoriaEdad = 18;

        //solicitar el ingreso de edad
        System.out.println("Ingrese su edad");
        int edad = sc.nextInt();//capturando el ingreso por consola
        //String nombre = sc.nextLine()
        if(edad >= mayoriaEdad){
            System.out.println("Usted es mayor de edad");
        }else{
            System.out.println("No esta permitido su ingreso");
        }
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

    }
}
