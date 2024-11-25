package java_OOP.test;

import java_OOP.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args){
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.divideNumeros(10, 2);
        double resul = calculadora.subtraiDoisNumeros(8, 2);
        System.out.println(resul);
    }
}
