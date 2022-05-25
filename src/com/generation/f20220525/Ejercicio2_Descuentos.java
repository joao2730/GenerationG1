package com.generation.f20220525;

import java.util.Scanner;


public class Ejercicio2_Descuentos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int edad, edadDescNinos, edadDescMayores, cantidadDeTickets;  //Declarar variables en una sola línea
        double descNinos, descMayores, descDesdeDos, precio;

        //Estáticas

        edadDescNinos = 15;
        edadDescMayores = 60;
        precio = 3500;
        descNinos = 0.4;
        descMayores = 0.45;
        descDesdeDos = 0.7;

        System.out.println("Por favor, ingrese su edad");
        edad = entrada.nextInt();

        if (edad <= edadDescNinos) {

            precio = precio * descNinos;
            System.out.println("El costo de su entrada es de: $" + precio);

        } else if (edad > edadDescNinos && edad <= edadDescMayores) {
            System.out.println("Cuantos tickets deseas comprar?");
            cantidadDeTickets = entrada.nextInt();
        if (cantidadDeTickets > 1) {
            precio = precio * cantidadDeTickets * descDesdeDos;
            System.out.println("El costo de su entrada es de: $" + precio);
        } }else if(edad>edadDescMayores){

                precio = precio * descMayores;
                System.out.println("El costo de su entrada es de: $" + precio);

        }
        int comision0 = 1000; //<= a     $1000 - N/A

        int comision1 = 4999;// $1001 - $4999 - 10%  utilizar comision 1+1 para llegar a 5001

        int comision2 = 9999;

        int comision3 = 10000;

        //Variables de operacion

        double porcentaje1 = 0.9;
        double porcentaje2 = 0.8;
        double porcentaje3 = 0.7;

        double valorTotal= 0;
        double valorComision = 0;

        System.out.println("Ingrese un monto para calcular la comision");
        int ventaCliente = entrada.nextInt();

        if (ventaCliente > comision0 && ventaCliente < comision1 ) {
            valorComision = ventaCliente * porcentaje1;
        } else if (ventaCliente > (comision1+1) && ventaCliente < comision2) {
            valorComision = ventaCliente * porcentaje2;
        }else if (ventaCliente >= comision3) {
            valorComision = ventaCliente * porcentaje3;
        }else{
            System.out.println("El monto ingresado no aplica a la promocion");
        }

        valorTotal =  ventaCliente + valorComision;
        valorComision = valorTotal - ventaCliente;
        System.out.println("El valor total es: $" + valorTotal);
        System.out.println("La comision es: $" + valorComision);


}

//
//Variable 30%
//Variable 20%
//variable 10%

    }
