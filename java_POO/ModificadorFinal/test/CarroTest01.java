package java_POO.ModificadorFinal.test;

import java_POO.ModificadorFinal.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.name = "audi";

        System.out.println(carro.getName());
    }
}
