package java_POO.test02;

import java_POO.dominio02.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int[] numeros = {1,2,3,4,5};

        calculadora.calcula(numeros);
        System.out.println("--------------------");
        calculadora.calculaComVarArgs(2,1,5,6,8,7);
    }
}
