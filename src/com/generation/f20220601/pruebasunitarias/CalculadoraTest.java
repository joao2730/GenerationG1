package com.generation.f20220601.pruebasunitarias;

import static org.junit.Assert.*;

public class CalculadoraTest {

    @org.junit.Test
    public void suma() {
        Calculadora calc = new Calculadora();
        int resultado = calc.suma(12,42);//54

        //assertEquals(valorEsparado, resultado);
        assertEquals(54, resultado);
    }

    @org.junit.Test
    public void resta() {
        Calculadora calc = new Calculadora();
        int resultado = calc.resta(42,12);//30

        assertEquals(30, resultado);
    }

    @org.junit.Test
    public void multlipicacion() {
        Calculadora calc = new Calculadora();
        int resultado = calc.multlipicacion(10,5);//50

        assertEquals(50, resultado);
    }

    @org.junit.Test
    public void division() {
        Calculadora calc = new Calculadora();
        String resultado = calc.division(0,0);//0

        assertEquals("No se puede dividir por cero", resultado);
        assertNotNull(resultado);
    }
    public boolean esPar(int num){
        if(num%2 == 0) {
            return true;
        }

        else {
            return false;
        }
    }

    public boolean esImpar(int num){
        if(num%2 == 0) {
            return false;//si es distinto a 0 retorna false
        }

        else {
            return true;//si es igual a 0 retorna true
        }
    }

}