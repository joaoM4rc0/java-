package java_OOP.test;

import java_OOP.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args){
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.divideNumeros(10, 2);
    }
}
