package org.JunitTest.atividade7;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Parametrizar {

    String nome;
    double peso;
    double altura;
    String resultado;

    public Parametrizar(String nome, double peso, double altura, String resultado) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.resultado = resultado;
    }

    @Parameterized.Parameters(name = "{0} - {2} - {3} - {4}")
    public static Collection<Object[]> parametros(){
        return Arrays.asList(new Object[][]{
                {"João", 70, 1.73, "João Obesidade grau III"},
                {"Maria", 80, 1.90, "Maria Obesidade grau III"},
                {"Carlos", 89, 1.80, "Carlos Obesidade grau III"},
                {"Lucia", 55, 1.55, "Lucia Obesidade grau II"}
        });
    }

    @Test
    public void validarIMC(){
        System.out.println(validarIMC(peso,altura));
        Assert.assertEquals(resultado, validarIMC(peso,altura));
    }

    public String validarIMC(double peso, double altura) {

        String retorno = null;
        double resultado = peso / altura;

        if (resultado < 16) {
            retorno = nome + " Baixo peso muito grave";

        } else if (resultado >= 16 && resultado <= 16.99) {
            retorno = nome + " Baixo peso grave";

        } else if (resultado >= 17 && resultado <= 18.49) {
            retorno = nome + " Baixo peso";

        } else if (resultado >= 18.50 && resultado <= 24.99) {
            retorno = nome + " Peso normal";

        } else if (resultado >= 25 && resultado <= 29.99) {
            retorno = nome + " Sobrepeso";

        } else if (resultado >= 30 && resultado <= 34.99) {
            retorno = nome + " Obesidade grau I";
        } else if (resultado >= 35 && resultado <= 39.99) {
            retorno = nome + " Obesidade grau II";
        } else if (resultado >= 40) {
            retorno = nome + " Obesidade grau III";
        }
        return retorno;
    }
}
