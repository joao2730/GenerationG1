package com.generation.f20220526;

import java.util.Scanner;

public class Funciones {
    public static void main(String[] args) {
          //Funciones
        //4 tipos de funciones
        //2 que retornan
        //2 que no retorna
        //nombre_funcion la primera letra se escribe siempre en minuscula
        //la palabra static nos permite acceder al metodo
        //no se puede crear un metodo dentro de otro metodo, si se puede llamar a otro metodo

        saludo();//llamado al metodo saludo
        calculoSumaPares(true, 23, "33", 44l, "sumar");

        //llamar a una funcion que no a sido asignada
        int edad = obtenerEdad();
        System.out.println(edad);

        //las variables de tipo boolean no se necesitan comparar porque es true o false
        boolean mayorOMenor = validarMayorEdad(edad);

        if(mayorOMenor){
            System.out.println("Puede ingresar al curso");
        }else{
            System.out.println("No tiene la edad suficiente para acceder al curso");
        }
    }
    /*******************FUNCIONES QUE RETORNAN*************************/
    //accesador, tipo_de_retorno, nombre_funcion(parametros a recibir)
    //void no retornan solo ejecutan codigo
    //la definicion de parametroe va dentro de la funcion
    public static void calculoSumaPares(boolean verdad, int numero1, String numero2, Long numero3, String accion){
        Integer num2 = Integer.parseInt(numero2);
        System.out.println(numero1 + numero3 + num2);
    }
    //el static permite acceder al metodo
    public static void saludo(){
        //ingreso de datos de parte del ususario
        System.out.println("Buenos dias");
    }

    /*******************FUNCIONES QUE NO RETORNAN*************************/
    //funciones que retornan un tipo de datos
    public static Integer obtenerEdad(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese edad");
        Integer edad = sc.nextInt();//18
        return edad;//retornar el contenido de la variable
    }

    public static Boolean validarMayorEdad(Integer edad){

        if(edad >= 18){
            System.out.println("Es mayor de edad");
            return true;
        }else{
            System.out.println("Es menor de edad");
            return false;
        }

        //return true;//false
    }
}
