package com.generation.f20220525;

import java.util.Scanner;

public class RangoIngresos {
    public static void main(String[] args) {
        //indicar edad
        //switch para cada calculo
        Scanner sc = new Scanner(System.in);

        int edad = 0;
        int primas = 0;
        String categoria = "";



        do {
            System.out.println("Ingrese la edad");
            edad = sc.nextInt();
        if (edad <= 29) {
            categoria = "joven";
            primas = 100;
        }
        if (edad <= 29 && edad <= 49) {
            categoria = "adulto";
            primas = 250;
        }
        if (edad <= 49 && edad <= 69) {
            categoria = "mayor";
            primas = 400;
        }
        if (edad >= 70) {
            categoria = "veterano";
            primas = 500;
        }


        switch (categoria) {
            case ("joven"):
                System.out.println("Usted es en la categoria: " + categoria);
                System.out.println("Su prima es de: $" + primas);

                break;

            case ("adulto"):
                System.out.println("Usted es en la categoria: " + categoria);
                System.out.println("Su prima es de: $" + primas);

                break;
            case ("mayor"):
                System.out.println("Usted es en la categoria: " + categoria);
                System.out.println("Su prima es de: $" + primas);

                break;
            case ("veterano"):
                System.out.println("Usted es en la categoria: " + categoria);
                System.out.println("Su prima es de: $" + primas);

                break;

            default:
                System.out.println("Dato no reconocido");

                break;
        }
        }while(edad!=0);
    }
}




