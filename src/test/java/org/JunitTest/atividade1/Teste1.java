package org.JunitTest.atividade1;

import org.JunitTest.atividade4.Regressivo;
import org.JunitTest.atividade4.Smoke;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class Teste1 {

    @Category(Smoke.class)
    @Test
    public void metodoTeste1(){
        System.out.println("Teste numero 1");
    }

    @Category(Smoke.class)
    @Test
    public void metodoTeste2(){
        System.out.println("Teste numero 2");
    }

    @Ignore(value = "Teste ignorado para testar a anotação @Ignore")
    @Category(Regressivo.class)
    @Test
    public void TestApp(){
        Assert.assertEquals("Não existe esse texto","Hell","HelloWorld");
        Assert.assertNotEquals("Não existe esse texto","Hell","HelloWorld");
    }
}
