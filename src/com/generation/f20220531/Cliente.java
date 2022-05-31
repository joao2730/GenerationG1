package com.generation.f20220531;

import java.util.List;

public class Cliente {
    private String rut;
    private String nombre;
    private Integer id;
    private List<Integer> numerosVenta;
    private String correo;

    //constructores


    public Cliente() {
    }

    /*public void modificarAtributo(){
        //rut = "12.345.678-9";
        //nombre = "Joao";
    }*/

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Integer> getNumerosVenta() {
        return numerosVenta;
    }

    public void setNumerosVenta() {
        this.numerosVenta = numerosVenta;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }
}
