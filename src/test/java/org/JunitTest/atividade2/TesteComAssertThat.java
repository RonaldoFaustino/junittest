package org.JunitTest.atividade2;

import io.restassured.internal.ResponseSpecificationImpl;
import org.hamcrest.MatcherAssert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.isA;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;



public class TesteComAssertThat {

    @Test
    public void validarThat(){
        assertThat("Joao", is("Joao"));
        assertThat("Joao", is(not("Maria")));
        assertThat("Joao", not("Maria"));
        assertThat("Joao", is(not(nullValue())));
        assertThat(null, is(nullValue()));


        assertThat(100,isA(Integer.class));
        assertThat("Teste", isA(String.class));

//        assertThat(50, greaterThan(40));
//        assertThat(50,lessThan(100));

        Integer[] listNumeros = {1,2,3,5,4,8};
        List<Integer> numeros = Arrays.asList(listNumeros);

        assertThat(numeros, hasSize(6));
        assertThat(numeros, contains(1,2,3,5,4,8));
        assertThat(numeros, containsInAnyOrder(1,2,3,8,4,5));
        assertThat(numeros,hasItem(4));
        assertThat(numeros,hasItems(4,8));

        assertThat("Marcos", anyOf(is("Maria"), is("Marcos")));

        assertThat("Maria", allOf(startsWith("Ma"), endsWith("ia"),containsString("ar")));



    }
}
