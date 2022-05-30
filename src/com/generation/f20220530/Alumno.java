package com.generation.f20220530;

public class Alumno {
    //encapsulacion: que podemos proteger la informacion no cualquiera puede obtener esa informacion
    //protected o public, private: solamente podemos acceder dentro de la misma clase
    //protected es como un condominio que podemos acceder todos los que estemos dentro del package
    //get y set
    //funciones
    //atributos
    private String nombre;
    private String apellido;
    private int edad;
    private String curso;

    //constructores
    public Alumno() {
    }


    public Alumno(String nombre, String apellido, int edad, String curso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.curso = curso;
    }
        //get y set
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

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getCurso() {
            return curso;
        }

        public void setCurso(String curso) {
            this.curso = curso;
        }

    @Override
    public String toString() {
        return "Alumno {" +
                "Nombre = '" + nombre + '\'' +
                ", Apellido = '" + apellido + '\'' +
                ", Edad = " + edad +
                ", Curso = '" + curso + '\'' +
                '}';
    }
}

