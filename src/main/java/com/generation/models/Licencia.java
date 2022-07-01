package com.generation.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "licencias")
public class Licencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer numero;
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date fechaVencimiento;
    private String clase;
    private String estado;

    //opcionales, sirven para la gestion de la base de datos
    @Column(updatable = false)//esta columna especifica nunca se va poder actualizar
    private Date createdAt;//se guarda la fecha en que fue insertada en la base de datos

    private Date updatedAt;//se guarda la fecha en que se actualizo
    //private Date deleteAt;//fecha de eliminacion logica (se da de baja no se borra)

    //Relaciones OneToOne (1a1)
    @OneToOne(fetch = FetchType.LAZY)
    // Eager carga los datos automaticante y el Lazy caraga los datos cuando yo la quiera consumir(a peticion)
    @JoinColumn(name = "usuario_id")//FK de la otra identidad
    private Usuario usuario;

    //Constructor vacio
    public Licencia() {
    }

    //Comnstructores con parametros
    public Licencia(Long id, Integer numero, Date fechaVencimiento, String clase, String estado) {
        this.id = id;
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.clase = clase;
        this.estado = estado;
    }

    //Getter and Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    //insertara en el atributo la fecha antes de insertar a base de datos
    @PrePersist
    protected void onCreate() {
        this.createdAt = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = new Date();
    }

}
