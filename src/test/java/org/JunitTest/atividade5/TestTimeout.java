package org.JunitTest.atividade5;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.assertFalse;

public class TestTimeout {

    @Rule public Timeout timeGlobal = Timeout.seconds(1);

    @Test(timeout = 1000)
    public void testeTime(){
        assertFalse(false);
    }

    @Test(timeout = 1000)
    public void testeTimeFalha() throws InterruptedException {
        Thread.sleep(980);
        assertFalse(false);
    }

    @Test
    public void testeSucesso1(){
        System.out.println("Teste Sucesso 1");
    }
    @Test
    public void testeSucesso2(){
        System.out.println("Teste Sucesso 2");
    }
}
