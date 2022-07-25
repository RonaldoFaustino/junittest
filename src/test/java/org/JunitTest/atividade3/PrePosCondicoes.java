package org.JunitTest.atividade3;

import org.junit.*;

public class PrePosCondicoes {

    @BeforeClass
    public static void metodoBeforeClass(){
        System.out.println("Metodo de Pre @BeforeClass");
        System.out.println("\n");
    }

    @Before
    public void metodoBefore(){
        System.out.println("Metodo de Pre @Before");
        System.out.println("__________ INICIO DO TESTE ___________");
        System.out.println("\n");
    }

    @Test
    public void metodoDeTest(){
        System.out.println("Metodo de @Test");
    }

    @Test
    public void metodoDeTest2(){
        System.out.println("Metodo de @Test2");
    }

    @After
    public void metodoAfter(){
        System.out.println("Metodo de Pos @After");
        System.out.println("__________ FIM DO TESTE ___________");
        System.out.println("\n");
    }


    @AfterClass
    public static void metodoAfterClass(){
        System.out.println("Metodo de Pos @AfterClass");
        System.out.println("\n");
    }
}
