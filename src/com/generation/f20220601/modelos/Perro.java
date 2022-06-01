package com.generation.f20220601.modelos;

public class Perro extends Mascota {//extends significa que estamos usando herencia
    //atributo propio del perro
    private Integer cantPaseos;
    private Float tamanioHocico;
    private String sonidoVocal;

    //Comntructos vacio (no simpre va el constructos vacio) se utiliza para seleccinar solo algunos parametros
    public Perro() {
    }

    //Constructor con parametros
    public Perro(String color, String especie, String pelaje, String nombre, float peso, String sexo,
                 Integer cantPaseos, Float tamanioHocico, String sonidoVocal) {
        super(color, especie, pelaje, nombre, peso, sexo);
        this.cantPaseos = cantPaseos;
        this.tamanioHocico = tamanioHocico;
        this.sonidoVocal = sonidoVocal;
    }

    //getter and setter (setear los atributos especificos)
    public Integer getCantPaseos() {
        return cantPaseos;
    }

    public void setCantPaseos(Integer cantPaseos) {
        this.cantPaseos = cantPaseos;
    }

    public Float getTamanioHocico() {
        return tamanioHocico;
    }

    public void setTamanioHocico(Float tamanioHocico) {
        this.tamanioHocico = tamanioHocico;
    }

    public String getSonidoVocal() {
        return sonidoVocal;
    }

    public void setSonidoVocal(String sonidoVocal) {
        this.sonidoVocal = sonidoVocal;
    }

    //To string para imprimir los atributos del perro
    @Override
    public String toString() {
        return "Perro{" +
                "cantPaseos=" + cantPaseos +
                ", tamanioHocico=" + tamanioHocico +
                ", sonidoVocal='" + sonidoVocal + '\'' +
                '}';
    }
    public void hacerSonido(){
        System.out.println("Guau, Guau");
    }
}
