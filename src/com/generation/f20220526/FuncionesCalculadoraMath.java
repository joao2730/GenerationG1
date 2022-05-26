package com.generation.f20220526;

public class FuncionesCalculadoraMath {
    public static void main(String[] args) {
        //Math

        //elevar o potencia
        double numeroElevado = Math.pow(4.8, 3);//primer valor el que quiero elevar, segundo numero es el exponente
        System.out.println(numeroElevado);

        //redondear al entero mayor
        double enteroMayor = Math.ceil(numeroElevado);
        System.out.println(enteroMayor);

        //redondear al entero menor
        double enteroMenor = Math.floor(numeroElevado);
        System.out.println(enteroMenor);

        //redondeo
        double enteroRedondeado = Math.round(numeroElevado);
        System.out.println(enteroRedondeado);

        double num1 = 12;
        double num2 = 5;
        System.out.println(num1/num2);

        //numeros aleatorios
        //Math.random() >= 0.0 y < 1.0, nunca entrega uno pero si cercanos a uno
        double aleatorio = Math.random();
        System.out.println(aleatorio);

        //numeros aleatorios entre 0 y 10, si quiero un numero cercano a 10 lo multiplico por el
        double num010 = Math.random() * 10;
        System.out.println(num010);

        //numeros aleatorios entre 2 y 8
        //Math.random() * (max - min) + min;
        double num28 = (Math.random() * (8-2)) + 2;
        System.out.println(Math.abs(num28));
        System.out.println(Math.round(num28));
        System.out.println(Math.floor(num28));

        //numero aleatorio entre -4 y 4
        double numNegPos = (Math.random() * (4 - -4)+ -4);
        System.out.println(numNegPos);

    }
}
