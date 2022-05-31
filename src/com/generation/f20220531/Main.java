package com.generation.f20220531;

import com.generation.f20220531.manager.ClienteManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //arreglo de clientes
        List<Cliente> listaCliente = new ArrayList<Cliente>();
        int opcion;

        //instancia de cliente
        Cliente cliente = new Cliente();//si no agrego constructores por default es un constructor vació
        cliente.setId(1234);
        cliente.setNombre("Joao");
        cliente.setRut("12.345.678-9");

        //do cubre el codigo que permite que el usuario ingrese otro cliente
        do {
            //excepciones
            Cliente clienteDatosDinamicos = new Cliente();

            //id del cliente
            System.out.println("Ingrese el id del cliente");
            Integer id = sc.nextInt();//le asignamos a id el scanner
            String idString = sc.nextLine();

            /**tipos de errores
             * InputMismatchException -->error de tipo de dato ingresado
             * NumberFormatException -->error de formato de numero
             * NullPointerException -->error de que se le asigno al punto
             * ArithmeticException -->error aritmetico**/
            /*try {
                Integer id = Integer.parseInt(idString);
                clienteDatosDinamicos.setId(id);
            } catch (NumberFormatException nfe) {//excepcion de tipo numero de un error
                System.out.println("No puede ingresar una letra como identificador " + nfe);
            } catch (Exception e) {//excepcion generica de un error
                System.out.println("ha ocurrido un erro, conecte al administrador " + e);
            }*/


            //nombre del cliente
            System.out.println("Ingrese el nombre del cliente");
            String nombre = sc.nextLine();
            clienteDatosDinamicos.setNombre(nombre);

            //rut del cliente
            System.out.println("Ingrese el rut del cliente");
            String rut = sc.nextLine();
            clienteDatosDinamicos.setRut(rut);

            //correo del cliente
            System.out.println("Ingrese el correo del cliente");
            String correo = sc.nextLine();
            clienteDatosDinamicos.setCorreo(correo);

            do {
            System.out.println("Desea ingresar un nuevo cliente? (1) si (0) no");
            opcion = sc.nextInt();
            //sc.next();//es para que de un doble salto al ingresar un dato

            }while (opcion < 0 || opcion > 1);
        }while(opcion == 1);

        /**acceder al metodo de otra clase**/
        //instancia de la clase
        ClienteManager cm = new ClienteManager();
        cm.recorrerArregloCliente(listaCliente);



    }
}
