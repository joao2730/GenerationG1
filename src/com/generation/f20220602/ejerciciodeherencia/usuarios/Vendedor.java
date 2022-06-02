package com.generation.f20220602.ejerciciodeherencia.usuarios;

import com.generation.f20220602.ejerciciodeherencia.usuarios.Usuario;

public class Vendedor extends Usuario {
    private Boolean puedePublicar = true;
    private int cantPublicaciones;

    public Vendedor() {
    }

    public Vendedor(Boolean puedePublicar, int cantPublicaciones) {
        this.puedePublicar = puedePublicar;
        this.cantPublicaciones = cantPublicaciones;
    }

    public Boolean getPuedePublicar() {
        return puedePublicar;
    }

    public void setPuedePublicar(Boolean puedePublicar) {
        this.puedePublicar = puedePublicar;
    }

    public int getCantPublicaciones() {
        return cantPublicaciones;
    }

    public void setCantPublicaciones(int cantPublicaciones) {
        this.cantPublicaciones = cantPublicaciones;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "puedePublicar=" + puedePublicar +
                ", cantPublicaciones=" + cantPublicaciones + super.toString() +
                '}';
    }

    //usuario prueba = nombre: usuarioPrueba password: test123
    public Boolean login(String nombre, String password) {

        if (nombre.equals("vendedorPrueba") && password.equals("test123")) {
            System.out.println("Has iniciado Sesion como usuario");
            return true;
        } else {
            System.out.println("Acceso denegado");
            return false;
        }
    }
        public String respondePreguntas(String respuesta) {
            System.out.println("su respuesta es: " + respuesta);
            return respuesta;
        }

}
