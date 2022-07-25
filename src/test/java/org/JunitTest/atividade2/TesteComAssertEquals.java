package org.JunitTest.atividade2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TesteComAssertEquals {

    @Test
    public void validarIgualdade(){
        assertEquals("Mensasagem de igualdade", "azul", "azul");
    }

    @Test
    public void validarNotIgualdade(){
        assertNotEquals("Mensasagem de igualdade", "azul", "azu");
    }
}
