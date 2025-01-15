package java_POO.generics.service;

import java_POO.generics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("mercedes")));

    public Carro BuscarCarrosDisponiveis() {
        System.out.println("Buscando carros...");
        Carro carro = carrosDisponiveis.remove(0);
        System.out.println("alugando carro: " + carro);
        return carro;
    }
    public void RetornarCarro(Carro carro) {
        System.out.println("carros disponiveis: " + carrosDisponiveis);
        System.out.println("devolvendo carro: " + carro);
        carrosDisponiveis.add(carro);
        System.out.println("carros disponiveis: " + carrosDisponiveis);
    }
}
