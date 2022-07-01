package com.generation.models;

import org.springframework.stereotype.Controller;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="usuarios")
public class Usuario {
    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min=3, max=20)// Size limita la cantidad de caracteres
    private String nombre;
    @Size(min=3, max=20)
    private String apellido;
    private Integer edad;
    @NotNull
    @Size(min=6, max=8)
    private String password;

    @Column(updatable = false)//esta columna especifica nunca se va poder actualizar
    private Date createdAt;//se guarda la fecha en que fue insertada en la base de datos

    private Date updatedAt;//se guarda la fecha en que se actualizo

    //OneToOne
    @OneToOne(mappedBy ="usuario",cascade =CascadeType.ALL,fetch = FetchType.LAZY)
    private Licencia licencia;

    //ManyToMany
    @ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(
            name = "roles_usuarios",//nombre tabla relacional
            joinColumns = @JoinColumn(name="usuario_id"),//desde la entidad actual
            inverseJoinColumns = @JoinColumn(name = "rol_id")//la otra entidad o tabla
            )
    private List<Rol> roles;


    //constructores
    public Usuario() {
    }

    public Usuario(Long id) {
        this.id = id;
    }

    public Usuario(String nombre, String apellido, Integer edad, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.password = password;
    }

    //Getters and Setters
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Long getId() {
        return id;
    }

    public Licencia getLicencia() {
        return licencia;
    }

    public void setLicencia(Licencia licencia) {
        this.licencia = licencia;
    }

    public List<Rol> getRoles() {
        return roles;
    }

    public void setRoles(List<Rol> roles) {
        this.roles = roles;
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
