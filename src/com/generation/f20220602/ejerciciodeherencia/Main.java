package com.generation.f20220602.ejerciciodeherencia;

import com.generation.f20220602.ejerciciodeherencia.usuarios.Cliente;
import com.generation.f20220602.ejerciciodeherencia.usuarios.Usuario;
import com.generation.f20220602.ejerciciodeherencia.usuarios.Vendedor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Usuario usuarioPrueba = new Usuario();
        Usuario vendedorPrueba = new Vendedor();
        Usuario clientePrueba = new Cliente();

        System.out.println("Ingrese su nombre de usuario");
        String nombreId = sc.nextLine();

        System.out.println("Ingrese su contraseña");
        String passwordId = sc.nextLine();

        usuarioPrueba.login(nombreId, passwordId);

        System.out.println("Ingrese su nombre de vendedor");
        String nombreVendedor = sc.nextLine();

        System.out.println("Ingrese su contraseña");
        String passwordVendedor = sc.nextLine();

        vendedorPrueba.login(nombreVendedor, passwordVendedor);

        System.out.println("Ingrese su nombre de cliente");
        String nombreCliente = sc.nextLine();

        System.out.println("Ingrese su contraseña");
        String passwordCLiente = sc.nextLine();

        clientePrueba.login(nombreCliente, passwordCLiente);

        //Casteamos a la clase especifica
        Cliente clientePrueba1 =  (Cliente) clientePrueba;
        System.out.println("Ingrese su pregunta:");
        String preguntaCliente = sc.nextLine();
        clientePrueba1.hacerPreguntas(preguntaCliente);

        Vendedor vendedorPrueba1 =  (Vendedor) vendedorPrueba;
        System.out.println("Ingrese su respuesta:");
        String respuestaVendedor= sc.nextLine();

        vendedorPrueba1.respondePreguntas(respuestaVendedor);
    }
}
