package com.generation.f20220527;

public class Auto {

    //clase es un modelo o prototipo
    //objeto, nace a partir de la clase, caracteristica o atributo,
    //tiene metodos o funciones, algo concreto lo convertimos en abstracto(no tangible).
    //tangible: usamos los 5 sentidos para describirlo
    //Atributo de colaboracion u objeto de colaboracion: Es tomar un objeto y
    // usarlo como atributo

    //atributo
    //accesador tipo nombreDelAtributo
    //private  |String |color
    //private solamente la clase puede acceder a ella
    //publico se puede acceder desde cualquier parte
    private String color;
    private String marca;
    private String modelo;
    private Double velocidad;

    //constructores
    //nos sirve para asignar valores a nuestros atributos
    //constructor con parametros
    public Auto(String color, String marca, String modelo, Double velocidad) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }
    //constructor vacio
    public Auto() {
    }

    //accesadores y mutadores (get y set)
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Double getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }

    //metodos o funciones
    //son personalizadas nosotros las escribimos
    public void aumentarVelocidad(){
        this.velocidad = 10d;
    }





}
