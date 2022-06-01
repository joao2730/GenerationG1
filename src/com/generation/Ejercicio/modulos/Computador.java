package com.generation.Ejercicio.modulos;

public class Computador extends AparatosElectronicos{
    private String teclado;
    private Integer tamaño;
    private String modelo;
    private String formasDeUso;

    public Computador() {
    }

    public Computador(String diodo, String transistor, String chip, String procesador, int cantidadDeCircuitos,
                      String teclado, Integer tamaño, String modelo, String formasDeUso) {
        super(diodo, transistor, chip, procesador, cantidadDeCircuitos);
        this.teclado = teclado;
        this.tamaño = tamaño;
        this.modelo = modelo;
        this.formasDeUso = formasDeUso;
    }

    public String getTeclado() {
        return teclado;
    }

    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }

    public Integer getTamaño() {
        return tamaño;
    }

    public void setTamaño(Integer tamaño) {
        this.tamaño = tamaño;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFormasDeUso() {
        return formasDeUso;
    }

    public void setFormasDeUso(String formasDeUso) {
        this.formasDeUso = formasDeUso;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "teclado='" + teclado + '\'' +
                ", tamaño=" + tamaño +
                ", modelo='" + modelo + '\'' +
                ", formasDeUso='" + formasDeUso + '\'' + super.toString() +
                '}';
    }
}
