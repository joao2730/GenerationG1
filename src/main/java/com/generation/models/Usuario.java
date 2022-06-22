package com.generation.models;

import org.springframework.stereotype.Controller;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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

    //constructores
    public Usuario() {
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

}
