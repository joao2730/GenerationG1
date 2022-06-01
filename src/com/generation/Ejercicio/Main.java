package com.generation.Ejercicio;

import com.generation.Ejercicio.modulos.AparatosElectronicos;
import com.generation.Ejercicio.modulos.Computador;
import com.generation.Ejercicio.modulos.SmartPhone;

public class Main {
    public static void main(String[] args) {
        AparatosElectricos aparatosElectricos = new AparatosElectricos();
        aparatosElectricos.setFabricante("Samsung");
        aparatosElectricos.setPotencia(3000);

        AparatosElectronicos aparatosElectronicos = new AparatosElectronicos();
        aparatosElectronicos.setChip("");
        aparatosElectronicos.setProcesador("Intel I7");

        Computador computador = new Computador();
        computador.setModelo("Asus");
        computador.setFormasDeUso("Trabajo");

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.setModelo("Apple");
        smartPhone.setTamano(6);

        System.out.println(aparatosElectricos.toString());
        System.out.println(aparatosElectronicos.toString());
        System.out.println(computador.toString());
        System.out.println(smartPhone.toString());

    }
}
