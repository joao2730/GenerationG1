package com.generation.f20220601.modelos;

public class Gato extends Mascota {//extends significa que estamos usando herencia
    //atributo propio del gato
    private Boolean garrasRetractil;
    private Boolean visionNocturna;
    private String sonidoVocal;

    //Constructor vacio (no siempre va el constructor vacio) se ocupa a veces para seleccionar solo algunos parametros
    public Gato() {
    }

    //Constructor con parametros
    public Gato(String color, String especie, String pelaje, String nombre, float peso, String sexo,
                Boolean garrasRetractil, Boolean visionNocturna, String sonidoVocal) {
        super(color, especie, pelaje, nombre, peso, sexo);
        this.garrasRetractil = garrasRetractil;
        this.visionNocturna = visionNocturna;
        this.sonidoVocal = sonidoVocal;
    }

    //to string para que me inprima los atributos del gato
    //override sobreescritura de metodo siempre que exista la herencia
    //con super llamamos a la clase padre
    @Override
    public String toString() {
        return "Gato{" +
                "garrasRetractil=" + garrasRetractil +
                ", visionNocturna=" + visionNocturna +
                ", sonidoVocal='" + sonidoVocal + '\'' + super.toString() +
                '}';
    }
    public void hacerSonido(){
        System.out.println("Miau, Miau");
    }
}
