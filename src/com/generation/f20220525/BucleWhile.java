package com.generation.f20220525;

import java.util.Scanner;

public class BucleWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Que propondria para implementar una nueva caracteristica

        System.out.println("(0) salir\n(1) sumar \n(2) restar \n(3) multiplicar \n(4) dividir");
        int opcion = sc.nextInt();//capturando el ingreso por consola

        /**VALIDAR EL INGRESO ERRONEO DE LA OPCION**/

        //hile valida que la condicion sea verdadera
        while (opcion < 0 || opcion > 4) {

            System.out.println("(0) salir\n(1) sumar \n 2 restar \n 3 multiplicar \n 4 dividir");
            opcion = sc.nextInt();
        }

        System.out.println("Fuera del while");

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


    }
}

