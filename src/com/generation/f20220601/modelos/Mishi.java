package com.generation.f20220601.modelos;

public class Mishi extends Gato {
    private Boolean famosoEnInternet;

    //Constructor vacio
    public Mishi() {
    }

    //Constructor con parametros
    public Mishi(String color, String especie, String pelaje, String nombre, float peso, String sexo, Boolean garrasRetractil,
                 Boolean visionNocturna, String sonidoVocal, Boolean famosoEnInternet) {
        super(color, especie, pelaje, nombre, peso, sexo, garrasRetractil, visionNocturna, sonidoVocal);
        this.famosoEnInternet = famosoEnInternet;
    }


    //getter and setter
    public Boolean getFamosoEnInternet() {
        return famosoEnInternet;
    }

    public void setFamosoEnInternet(Boolean famosoEnInternet) {
        this.famosoEnInternet = famosoEnInternet;
    }

    //to String para hacer el llamado
    /*@Override
    public String toString() {
        return "Michi{" +
                "famosoEnInternet=" + famosoEnInternet + super.toString() +
                '}';
    }*/

}
