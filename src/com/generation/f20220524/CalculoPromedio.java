package com.generation.f20220524;

public class CalculoPromedio {

    public static void main(String[] args) {
        //int cantidadNotas = 12;
        //arreglo
        Integer[] notas = {357, -50, 55, 57, 400, -40, 47, 56, 155, 48, 150, 148};

        //promedio-->suma todas las notas/ cantidad de notas;
        int sumaNotas = 0;//20
        int notasFueraDeRango = 0;

        //como recorrer el arreglo de notas
        for (int i = 0; i < notas.length; i++) {//i=0
            //validar la nota (negativa o mayor a 100)
            if(notas[i] < 0 || notas[i] > 100){
                System.out.println("La nota: " + notas[i] + " en la posicion "+ (i + 1) +" esta fuera de rango");
                notasFueraDeRango++;
            }

            sumaNotas = sumaNotas + notas[i];//accedemos a los valores
        }
        if (notasFueraDeRango == 0) {//no hay notas fuera de rango


        //promedio-> suma todas las notas / cantidad de notas;
        float promedio = sumaNotas / notas.length;

        /* TODO validar el orden >= */
        //101

        //PUNTO CRITICO TOPE DE NOTA 100
        //0>=repobado<=49; 50>=aprobado<=100
        if(promedio >= 50 && promedio <= 100) {
            System.out.println("Usted a sido aprobado");
            System.out.println("\nEl promedio es: " +promedio);
        }else if(promedio >=0 && promedio <=49){
            System.out.println("Usted a sido reprobado");
            System.out.println("\nEl promedio es: " +promedio);
        }else{
            System.out.println("\nError en el calculo de los datos");
        }

        }else{
            System.out.println("\nFavor revisar notas");
        }
        //Winner Pamela
        int test = 51;
        if(51 >= test);{
            System.out.println("\nes lo mismo");
    }
    }

}
