package com.generation.f20220527;

import java.util.ArrayList;
import java.util.HashMap;

public class ColeccionesMap {
    public static void main(String[] args) {
        //el HashMap sirve para establecer datos
        //colecciones Map o HashMap
        //Pares clave <--> valor
        //las 2 formas de escribir el HasMap
        //HashMap<K, V> map = new HashMap<K, V>(); HashMap mapa = new HashMap();
        //k: key o clave; V: value o valor
        //HashMap es lo mas cercano a trabajar con una API

        //Esta se puede recorrer de manera mas facil
        //HashMap<String, String> objHashMap = new HashMap<>();//esta funcion solo acepta un tipo de asignacion por lo cual es mas estatica
        HashMap objHashMap = new HashMap();//esta funcion es mas abierta
        //los HashMap no trabajan con posiciones solo con valores

        objHashMap.put("Nombre", " Joao");
        objHashMap.put("ApellidoP", " Aranda");
        objHashMap.put("ApellidoM", " Ortega");
        objHashMap.put("Edad", " 27");

        System.out.println("Elementos del mapa");
        System.out.println(objHashMap);

        //obtener un valor a traves de la clave
        System.out.println(objHashMap.get("ApellidoP"));

        //eliminar par (clave, valor)
        objHashMap.remove("ApellidoM");
        System.out.println(objHashMap);

        //Muestra todas las llaves disponibles
        System.out.println(objHashMap.keySet());

        //Mostrar todos los valores del mapa
        System.out.println(objHashMap.values());

        //agregar varios valores a una llave
        ArrayList<String> vocales = new ArrayList<String>();
        vocales.add("a");
        vocales.add("e");
        vocales.add("i");
        vocales.add("o");
        vocales.add("u");

        objHashMap.put("Vocales", vocales);
        System.out.println(objHashMap);

        //si no encuentra la clave retorna un null
        System.out.println(objHashMap.get("vocales"));

        //arreglo de numeros es con Integer
        ArrayList<Integer> numerosPares = new ArrayList<Integer>();
        numerosPares.add(2);
        numerosPares.add(4);
        numerosPares.add(6);
        numerosPares.add(8);
        numerosPares.add(10);

        objHashMap.put("Numeros Pares", numerosPares);
        System.out.println(objHashMap);

        //como recorrer un HashMap
        for (Object clave : objHashMap.keySet()) {
            System.out.println("Clave: " + clave +" - valor: " + objHashMap.get(clave));
            }

        }



    }

