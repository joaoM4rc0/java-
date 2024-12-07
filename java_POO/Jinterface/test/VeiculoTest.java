package java_POO.Jinterface.test;

import java_POO.Jinterface.dominio.Carro;

public class VeiculoTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.acelerar();
        carro.freiar();
        carro.buzinar();
    }
}
//só para tirar o bug do github
