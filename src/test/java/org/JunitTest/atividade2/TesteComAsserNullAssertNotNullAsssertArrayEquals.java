package org.JunitTest.atividade2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNull;

public class TesteComAsserNullAssertNotNullAsssertArrayEquals {

    String valor = null;
    String valor2 = "Valor";

    String[] cars = {"Volvo","BMW", "Ford","Mazda"};
    String[] cars1 = {"Volvo","BMW", "Ford","Mazda"};

    @Test
    public void validarNull(){
        assertNull("valor não é null", valor);
    }

    @Test
    public void validarNotNull(){
        assertNotNull("valor não é null", valor2);
    }

    @Test
    public void validarArrays(){
        assertArrayEquals("As informações dos array são diferentes: ",cars ,cars1 );



    }

}
