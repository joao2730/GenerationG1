package com.generation.f20220526;

import java.util.ArrayList;
import java.util.Collections;

public class ColeccionArrayList {
    public static void main(String[] args) {
        //ArrayList
        //instancia de clase
        ArrayList<String> colores = new ArrayList<String>();
        ArrayList<Integer> numerosPares = new ArrayList<Integer>();

        //agregar un elemento a la lista, add agregar elementos
        colores.add("rojo");
        colores.add("azul");
        colores.add("blanco");

        //si existe un elemento en esa posicion lo desplaza
        colores.add(0,"amarillo");

        //imprimir el contenido
        System.out.println(colores);

        //acceder a un elemento, get(posicion del elemento) imprimir un elemento en especifico
        System.out.println(colores.get(2));

        //tamaño del arreglo size()
        System.out.println(colores.size());

        //modificar un elemento, set(posicion, elemento nuevo) para modificar
        colores.set(1, "Negro");
        System.out.println(colores);

        //recorrer el arreglo
        for (int i = 0; i < colores.size(); i++) {
            System.out.println(colores.get(i));
        }
        System.out.println("*********************");
        for (String color : colores) {
            System.out.print(color + ", ");
        }

        System.out.println("\n");
        //quitar un elemento, remove(posicion del elemento) para borrar un elemento
        colores.remove(2);
        System.out.println(colores);

        //desde aqui hacia abajo queda ordenado
        //ordenar el arreglo de forma ascendente, sort(elemento)
        Collections.sort(colores);
        System.out.println(colores);

        numerosPares.add(34);
        numerosPares.add(44);
        numerosPares.add(4);
        numerosPares.add(16);
        numerosPares.add(24);
        numerosPares.add(14);

        //ordena los elementos de manera ascendente, sort(elemento) los ordena de menor a mayor
        System.out.println(numerosPares);
        System.out.println();
        Collections.sort(numerosPares);
        System.out.println(numerosPares);

        //reverse no ordena de forma descendente, reverse(elemento) voltea como este hecho el array
        System.out.println();
        Collections.reverse(numerosPares);
        System.out.println(numerosPares);

        //quitar todos los elementos, clear()
        colores.clear();
        System.out.println(colores);



    }
}
