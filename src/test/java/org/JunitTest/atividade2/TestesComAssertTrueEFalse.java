package org.JunitTest.atividade2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestesComAssertTrueEFalse {

    @Test
    public void validarTrue(){
        boolean status = true;
        String texto = "Valor";

        assertTrue("O Status não é verdadeiro",status);
        //assertFalse("O status não é falso: ",status);

        assertTrue("O texto não contém a mensagem Valor: ", texto.contains("Valor"));
    }

    @Test
    public void validarTFalse(){
        boolean status = false;
        String texto = "Valor";

        assertFalse("O Status não é verdadeiro",status);
        assertFalse("O status não é falso: ",status);

        assertFalse("O texto não contém a mensagem Valor: ", texto.contains("Texto"));
    }
}
