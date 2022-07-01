package com.generation.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="autos")
public class Auto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Atributos
    private String marca;
    private String modelo;
    private String color;
    @NotNull
    @Size(min=6, max=6)
    private String patente;
    private Float valor;

    //ManyToMany AutosVentas
    @ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(
            name = "autos_ventas",//nombre tabla relacional
            joinColumns = @JoinColumn(name="auto_id"),//desde la entidad actual
            inverseJoinColumns = @JoinColumn(name = "compra_venta_id")//la otra entidad o tabla
    )
    private List<CompraVenta> comprasVentas;



    @Column(updatable = false)//esta columna especifica nunca se va poder actualizar
    private Date createdAt;//se guarda la fecha en que fue insertada en la base de datos

    private Date updatedAt;//se guarda la fecha en que se actualizo

    //Constructores
    public Auto() {
    }

    //Constructot con parametros para definir los atributos
    public Auto(String marca, String modelo, String color, String patente, Float valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.patente = patente;
        this.valor = valor;
    }

    //Getter and Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public List<CompraVenta> getComprasVentas() {
        return comprasVentas;
    }

    public void setComprasVentas(List<CompraVenta> comprasVentas) {
        this.comprasVentas = comprasVentas;
    }

    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }

}
