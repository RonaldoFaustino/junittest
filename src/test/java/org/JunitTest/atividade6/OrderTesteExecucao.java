package org.JunitTest.atividade6;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OrderTesteExecucao {

    @Test
    public void test1(){
        System.out.println("Teste 1");
    }

    @Test
    public void test2(){
        System.out.println("Teste 2");
    }
    @Test
    public void test3(){
        System.out.println("Teste 3");
    }
    @Test
    public void test4(){
        System.out.println("Teste 4");
    }
    @Test
    public void test5(){
        System.out.println("Teste 5");
    }
    @Test
    public void test6(){
        System.out.println("Teste 6");
    }
}
