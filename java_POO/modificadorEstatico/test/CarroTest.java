package java_POO.modificadorEstatico.test;

import java_POO.modificadorEstatico.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro("bmw", 280);
        Carro carro2 = new Carro("mercedes", 275);
        Carro carro3 = new Carro("audi", 290);

        Carro.setVelocidadeLimite(180);
        carro.imprime();
        carro2.imprime();
        carro3.imprime();
    }

}
