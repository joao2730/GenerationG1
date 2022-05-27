package com.generation.f20220527;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MenuDeComida {
    public static void main(String[] args) {
        //crear un menu de comida
        //solicitar al usuario que elija el plato
        //imprimir el plato
        Scanner sc = new Scanner(System.in);

        //Agregar valores a un hashmap desde un ArrayList generado por input (ingreso de usuario)
        HashMap objHashMap = new HashMap();
        System.out.println(objHashMap.values());
        ArrayList<String> pedidos = new ArrayList <>();
        ArrayList<String> comidas = new ArrayList<>();
        comidas.add("Fideos con pasta");
        comidas.add("Lentejas");
        comidas.add("Porotos");
        comidas.add("arroz con pollo");

        ArrayList<String> postre = new ArrayList<>();
        postre.add("Torta de chocalate");
        postre.add("Pie de lImon");
        postre.add("Brownie");
        postre.add("Helado");


        boolean seguir = true;

        while (seguir) {
            System.out.println("Menu");
            System.out.println("1]. Fideos con pasta");
            System.out.println("2]. Porotos");
            System.out.println("3]. Arroz con pollo");
            System.out.println("4]. Lentejas");
            System.out.println("Ingrese la opcion que desea agregar:");
            String seleccion = sc.next();
            pedidos.add(seleccion);
            System.out.println("Postres");
            System.out.println("1). Torta de chocolate");
            System.out.println("2). Pie de limon");
            System.out.println("3). Brownie");
            System.out.println("4). Helado");
            System.out.println("Ingrese la opcion que desea agregar:");
            seleccion = sc.next();
            postre.add(seleccion);

            System.out.println("Desea agregar mas pedidos? 1)Si 2)No ");
            int respuesta = sc.nextInt();

            if (respuesta == 2) {
                System.out.println("saliendo del programa");
                break;
            }
        }
        objHashMap.put("Pedidos", pedidos);
        objHashMap.put("Postre", pedidos);
        System.out.println(objHashMap.values());
    }
}
