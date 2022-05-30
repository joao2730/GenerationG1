package com.generation.f20220530;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //instancia de una clase
        //es una definicion de un objeto
        //getter: para obtener el atributo que asignamos a la variable del objeto
        //set: asignar un atributo a la variable del objeto

        Alumno alumno = new Alumno ();//para asignar valores a nuestros atributos, hacemos uso de nuestro constructor
        // vacio para a posterior asignarle parametros

        //Alumno alumno2 = new Alumno("Leonardo", "Utreras", 26, "G1");//invocando al constructor con parametros

        //list es una interfaz
        //array list es una clase que usa todos lo metodos de las listas abstractas
        List<Alumno> listaAlumnos = new ArrayList<>();
        /**la diferencia entre list y arraylist las interfaces solo van a definir los metodos**/
        /**el arraylist amplia las opciones de un elemento**/

        //alumno.setNombre("Diana");

        //System.out.println(alumno.getNombre());//null
        //System.out.println(alumno2.getNombre());

        //setter
        //alumno.setNombre("Joao");//asignacion a alumno null
        //System.out.println(alumno.getNombre());

        //crear tantas instancias como miembros del equipo
        //y luego imprimirlo
        Alumno alumno2 = new Alumno ("Cristobal", "Hapsoo", 23,"G1");
        Alumno alumno3 = new Alumno ("Cristian", "Yañez", 26,"G1");
        Alumno alumno4 = new Alumno ("Alejandro", "Heredia", 29,"G1");
        Alumno alumno5 = new Alumno ("Luis", "García", 28,"G1");
        Alumno alumno6 = new Alumno ("Joao", "Aranda", 28,"G1");

        //asignación a lista de alumnos
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);

        //Definiendo valores por default

        //Llamando a la funcion del get(Atributos) y set (Aignar un valor al atributo)
        /*System.out.println(alumno.getNombre());
        System.out.println(alumno2.getNombre());
        System.out.println(alumno3.getNombre());
        System.out.println(alumno4.getNombre());
        System.out.println(alumno5.getNombre());
        System.out.println(alumno6.getNombre());*/

        // setter
        //alumno.setNombre("Cris");
        System.out.println("--------- Grupo 3 --------");
        System.out.println("Nombre Alumno 1: " + alumno2.getNombre() +" - Apellido: " +alumno2.getApellido() +" - Edad: " +alumno2.getEdad() +
                " - Curso: " +alumno2.getCurso());
        System.out.println("Nombre Alumno 2: " + alumno3.getNombre() + " - Apellido: " +alumno3.getApellido() +" - Edad: " +alumno3.getEdad() +
                "- Curso: " +alumno2.getCurso());
        System.out.println("Nombre Alumno 3: " + alumno4.getNombre() +" - Apellido " +alumno4.getApellido() +" - Edad: " +alumno4.getEdad() +
                " - Curso: " +alumno2.getCurso());
        System.out.println("Nombre Alumno 4: " + alumno5.getNombre() +" - Apellido " +alumno5.getApellido() +" - Edad: " + alumno5.getEdad() +
                " - Curso: " +alumno2.getCurso());
        System.out.println("Nombre Alumno 5: " + alumno6.getNombre() +" - Apellido " +alumno6.getApellido() +" - Edad: " + alumno6.getEdad() +
                " - Curso: " +alumno2.getCurso());

        /* imprimir todo el contenido con to string */
        System.out.println(alumno2.toString());
        System.out.println(alumno3.toString());
        System.out.println(alumno4.toString());
        System.out.println(alumno5.toString());
        System.out.println(alumno6.toString());

        //for (i=0; i< "variable")
        for (int i = 0; i < listaAlumnos.size(); i++) {// antes era una variable y ahora es un objeto con arraylist
            System.out.println(listaAlumnos.get(i).getNombre()+" "+ listaAlumnos.get(i).getApellido());
        }
        //for each
        for (Alumno objetoAlumno : listaAlumnos) {
            //System.out.println(objetoAlumno.getNombre()+ " "+ objetoAlumno.getApellido()+ " - Curso: "+ objetoAlumno.getCurso());
            System.out.println(objetoAlumno);

            /**sobreescritura y sobrecarga de metodos**/

        }

    }
}
