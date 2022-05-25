package com.generation.f20220525;

import java.util.Scanner;

public class CondicionalSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese opcion");
        System.out.println("1 sumar \n 2 restar \n 3 multiplicar \n 4 dividir");
        int opcion = sc.nextInt();


        switch (opcion) {
            case 1://sumar
                //accion para la opcion 1
                System.out.println("** Suma");
                break;

            case 2:
                System.out.println("** Resta");
                break;
            case 3:
                System.out.println("** Multiplicar");
                break;
            case 4:
                System.out.println("** Dividir");
                break;

            default:
                System.out.println("opcion invalida");
                break;
        }

        System.out.println("Fuera del switch");


    }
}