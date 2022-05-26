package com.generation.f20220526;

import java.util.Arrays;

public class ColeccionArray {
    public static void main(String[] args) {
        //Array ESTATICOS, fijos no se le pueden agregar mas elementos
        //arreglo de tipo String
        String[] colores = {"red", "blue", "orange", "white", "yellow"};
        //arreglo de tipo numerico
        Integer[] numerosPares = {2, 4, 6, 8, 10, 12};//2,4,6,8,14,12
        int[] primerosNumeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        //posicion inicial es (0)
        System.out.println(colores[0]);
        System.out.println(numerosPares[0]);
        System.out.println(primerosNumeros[0]);

        //nombreArray[posicion]-> accediendo al elemento del arreglo en esa posisicon
        System.out.println(numerosPares[4]);//10

        numerosPares[4] = 14;//modificando el elmento en esa posicion
        System.out.println(numerosPares[4]);//14

        // no podemos agregar un elemento a una posicion que no existe
        //numerosPares[7] = 14;//Error fuera de indice

        System.out.println("Tamaño array colores: " + colores.length);
        System.out.println("Tamaño array numeros pares: " + numerosPares.length);

        //imprimir el arreglo
        System.out.println(Arrays.toString(colores));
        System.out.println(Arrays.toString(numerosPares));
        System.out.println(Arrays.toString(primerosNumeros));

        //recorrer un arreglo
        for (int i = 0; i < primerosNumeros.length; i++) {
            System.out.print(primerosNumeros[i] + ", ");
        }
        //foreach
        System.out.println("\n");
        for (String elemento : colores) {
            System.out.print(elemento + ", ");

        }
        System.out.println("\n");
        for (int elemento : numerosPares) {
            System.out.print(elemento + ", ");
        }
        System.out.println("\n");
        for (int elemento : primerosNumeros) {
            System.out.print(elemento + ", ");
        }


    }
}