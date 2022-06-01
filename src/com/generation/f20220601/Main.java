package com.generation.f20220601;

import com.generation.f20220601.modelos.Gato;
import com.generation.f20220601.modelos.Mascota;
import com.generation.f20220601.modelos.Mishi;
import com.generation.f20220601.modelos.Perro;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //herencia
        //aqui va a ir solo las instancias y los llamados
        //instancia de mascota
        Mascota mascota = new Mascota();
        mascota.setColor("gris");
        mascota.setNombre("tom");

        Perro perro = new Perro();
        perro.setNombre("RedFaund");
        perro.setColor("Ayun");

        Gato gato = new Gato();
        gato.setEspecie("Felino");
        gato.setPelaje("Pelo");
        gato.setPeso(3);

        //System.out.println(gato.toString());
        //System.out.println(perro.toString());
        //System.out.println(mascota.toString());

        //Instancia de la clase Mishi
        Mishi mishi = new Mishi();

        //se soobreescribe el metodo de padre
        System.out.println(mishi.toString());
        mishi.setColor("Amarillo");
        System.out.println(mishi.toString());

        /**Polimorfismo**///es cuando un objeto padre se comporta como hijo
        List<Mascota> listaMascotas = new ArrayList<>();
        Mascota regalon = new Mascota("Negro", "Canes", "Pelo", "Firulais", 6,
                "Macho");
        listaMascotas.add(regalon);

        Mascota felix = new Gato();
        felix.setNombre("Felix");
        felix.setColor("Negro");
        felix.setPeso(5);
        listaMascotas.add(felix);

        Mascota chocolo = new Perro();
        chocolo.setNombre("Chocolo");
        chocolo.setColor("Cafe");
        chocolo.setPeso(9);
        listaMascotas.add(chocolo);

        System.out.println("*****************");
        regalon.hacerSonido();//llamando al metodo en mascota
        felix.hacerSonido();
        chocolo.hacerSonido();

        System.out.println("******************");
        //recorrer el arreglo(para recorre se utiliza un for each o un for con formula)
        for(Mascota mascota2 : listaMascotas){
            mascota2.hacerSonido();
        }
        //transformar el objeto generico a uno especifico(si quiero hacer la transformacion
        // tengo que hacer un getter y setter en la clase que quiera transformar)
        Perro perroChocolo = (Perro) chocolo;
        perroChocolo.setCantPaseos(5);
    }
}
