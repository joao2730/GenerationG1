package com.generation.f20220601.modelos;

public class Mascota {

    //atributos que comparten las mascotas
    private String color;
    private String especie;
    private String pelaje;
    private String nombre;
    private float peso;
    private String sexo;

    //constructor vacio
    public Mascota() {
    }

    //constructor con parametros
    public Mascota(String color, String especie, String pelaje, String nombre, float peso, String sexo) {
        this.color = color;
        this.especie = especie;
        this.pelaje = pelaje;
        this.nombre = nombre;
        this.peso = peso;
        this.sexo = sexo;
    }


    //get and set
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "color='" + color + '\'' +
                ", especie='" + especie + '\'' +
                ", pelaje='" + pelaje + '\'' +
                ", nombre='" + nombre + '\'' +
                ", peso=" + peso +
                ", sexo='" + sexo + '\'' +
                '}';
    }
    public void hacerSonido(){
        System.out.println("Muuuuu");
    }
}
