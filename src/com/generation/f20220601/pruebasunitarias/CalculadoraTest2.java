package com.generation.f20220601.pruebasunitarias;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest2 {

    @Test
    public void Testsuma() {
        Calculadora calc = new Calculadora();
        int resultado = calc.suma(12,42);//54

        //assertEquals(valorEsparado, resultado);
        assertEquals(54, resultado);//falla si el resultado no es igual
        assertNotEquals(45, resultado);//falla si el resultado es igual
        assertNotNull(resultado);//falla si el resultado es null
        assertNotSame(45, resultado);//falla si el resultado es igual al resultado no esperado
    }
}