package com.generation.Ejercicio.modulos;

public class SmartPhone {
    private String portabilidad;
    private Integer tamano;
    private String modelo;

    public SmartPhone() {
    }

    public SmartPhone(String portabilidad, Integer tamano, String modelo) {
        this.portabilidad = portabilidad;
        this.tamano = tamano;
        this.modelo = modelo;
    }

    public String getPortabilidad() {
        return portabilidad;
    }

    public void setPortabilidad(String portabilidad) {
        this.portabilidad = portabilidad;
    }

    public Integer getTamano() {
        return tamano;
    }

    public void setTamano(Integer tamano) {
        this.tamano = tamano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "portabilidad='" + portabilidad + '\'' +
                ", tamano=" + tamano +
                ", modelo='" + modelo + '\'' + super.toString() +
                '}';
    }
}
