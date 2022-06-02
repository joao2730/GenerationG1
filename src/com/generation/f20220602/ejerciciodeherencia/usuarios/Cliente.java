package com.generation.f20220602.ejerciciodeherencia.usuarios;

import java.util.List;

public class Cliente extends Usuario {
    //atributos de cliente
    private int cantCompras;
    private String interes;
    private String nombre;
    private List<Integer> numerosDeVenta;
    private String correo;

    //constructor vacio
    public Cliente() {
    }

    //constructor con parametros
    public Cliente(String nombre, String password, String correo, String rut, String direccion, String genero,
                   int edad, Boolean esPremium, Boolean usuarioBloqueado, int cantCompras, String interes, String nombre1, List<Integer> numerosDeVenta, String correo1) {
        super(nombre, password, correo, rut, direccion, genero, edad, esPremium, usuarioBloqueado);
        this.cantCompras = cantCompras;
        this.interes = interes;
        this.nombre = nombre1;
        this.numerosDeVenta = numerosDeVenta;
        this.correo = correo1;
    }

    //getter and setter
    public int getCantCompras() {
        return cantCompras;
    }

    public void setCantCompras(int cantCompras) {
        this.cantCompras = cantCompras;
    }

    public String getInteres() {
        return interes;
    }

    public void setInteres(String interes) {
        this.interes = interes;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getNumerosDeVenta() {
        return numerosDeVenta;
    }

    public void setNumerosDeVenta(List<Integer> numerosDeVenta) {
        this.numerosDeVenta = numerosDeVenta;
    }

    @Override
    public String getCorreo() {
        return correo;
    }

    @Override
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    //to String de cliente
    @Override
    public String toString() {
        return "Cliente{" +
                "cantCompras=" + cantCompras +
                ", interes='" + interes + '\'' +
                ", nombre='" + nombre + '\'' +
                ", numerosDeVenta=" + numerosDeVenta +
                ", correo='" + correo + '\'' + super.toString() +
                '}';
    }

    //usuario prueba = nombre: usuarioPrueba password: test123
    public Boolean login(String nombre, String password) {

        if (nombre.equals("clientePrueba") && password.equals("test123")) {
            System.out.println("Has iniciado Sesion como usuario");
            return true;
        } else {
            System.out.println("Acceso denegado");
            return false;
        }
    }
    public String hacerPreguntas(String pregunta) {
        System.out.println("La pregunta ha sido pudblicada como: " + pregunta);
        return pregunta;
    }
}
