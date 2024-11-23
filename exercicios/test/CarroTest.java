package test;

import dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro2 = new Carro();
        Carro carro = new Carro();

        carro.nome = "ford"; 
        carro.modelo = "fiesta";
        carro.ano = 2014;
        
        carro2.nome = "fusca bala "; 
        carro2.modelo = "sport";
        carro2.ano = 2018;

        
    }
}
