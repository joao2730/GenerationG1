package com.generation.f20220526;

import java.util.Scanner;

public class FuncionesCalculadora {
    public static void main(String[] args) {
        //suma
        //resta
        //multiplicacion
        //Division
        //Si esos 2 numeros son par e impar
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese num1");
        int num1 = sc.nextInt();

        System.out.println("Ingrese num2");
        int num2 = sc.nextInt();

    }

    public static int suma(int num1, int num2) {

        int resultadoSuma = num1 + num2;
        return resultadoSuma;
    }

    public static int resta(int num1, int num2) {

        int resultadoResta = num1 + num2;
        return resultadoResta;
    }

    public static int multlipicacion(int num1, int num2) {

        int resultadoMultlipicacion = num1 + num2;
        return resultadoMultlipicacion;
    }

    public static int division(int num1, int num2) {

        int resultadoDivision = num1 + num2;
        return resultadoDivision;
    }

    public static int modulo(int num1, int num2) {

        int resultadoModulo = num1 + num2;
        return resultadoModulo;
    }
}
