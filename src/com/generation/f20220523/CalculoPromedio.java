package com.generation.f20220523;

public class CalculoPromedio {

    public static void main(String[] args) {
        //int cantidadNotas = 12;
        //arreglo
        Integer[] notas = {40, 50, 45, 57, 52, 10, 47, 56, 55, 38, 40, 48};

        //promedio-->suma todas las notas/ cantidad de notas;
        int sumaNotas = 0;

        //como recorrer el arreglo de notas
        for (int i = 0; i < notas.length; i++) {//i=0

            sumaNotas = sumaNotas + notas[i];
        }
        System.out.println("suma de notas: " + sumaNotas);
        //promedio-> suma todas las notas / cantidad de notas;
        float promedio = sumaNotas / notas.length;
        /* TODO validar el orden >= */
        //101
        if(promedio >= 50 && promedio <= 100) {

        }else {

        }
    }

}
