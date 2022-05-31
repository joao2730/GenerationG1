package com.generation.f20220531.manager;

import com.generation.f20220531.Cliente;

import java.util.List;

//logica de negocio
public class ClienteManager {
    Cliente cliente = new Cliente();
    //recorrer el arreglo e imprimir

    //funcion que no retorna nada y se le agrega la listaCliente que está en otro package
    public void recorrerArregloCliente(List<Cliente> listaCliente) {
        for (Cliente cliente : listaCliente) {
            System.out.println("Tu nombre es: " + cliente.getNombre());
            System.out.println("Tu RUT es: " + cliente.getRut());
            System.out.println("Tu identificador es: " + cliente.getId());
            System.out.println("Tu correo es: " + cliente.getCorreo());
        }
    }

}



