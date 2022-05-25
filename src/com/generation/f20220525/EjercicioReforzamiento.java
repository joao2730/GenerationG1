package com.generation.f20220525;

import java.util.Scanner;

public class EjercicioReforzamiento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //escribe un programa que solicite el valor inferior y superior de un rango.

        //A continuación se van introduciendo números hasta que introduzcamos el 0.
        int limiteInferior, limiteSuperior, numero, sumaDentro, numFuera, numDentro;

        //variables establecidas
        sumaDentro = 0;
        numDentro = 0;
        numFuera = 0;

        do {
            System.out.println("Ingrese el limite Inferior");
            limiteInferior = sc.nextInt();
            System.out.println("Ingrese el limite superior");
            limiteSuperior = sc.nextInt();

        } while (limiteInferior > limiteSuperior);

        System.out.println("A continuacion ingresa tus numeros \n,si quiueres finalizar, ingresa un numero 0 ");
        do{
            System.out.println("Ingresa tu numero");
            numero = sc.nextInt();

            if(numero >= limiteInferior && numero <= limiteSuperior){//¿consideramos limites?
                System.out.println();
                sumaDentro += numero;
            }
            if(numero < limiteInferior || numero > limiteSuperior){
                numFuera++;
            }
            if(numero == limiteInferior || numero == limiteSuperior){
                numDentro++;
            }
        }while(numero !=0);

        System.out.println("La suma de los numeros que estan dentro del rango es: " + sumaDentro);
        System.out.println("Cuantos numeros estan fuera del rango?\n " + numFuera);
        System.out.println("Cuantos numeros son igual a los valores del rango?\n " + numDentro);

    }
}
