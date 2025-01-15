package java_POO.generics.service;

import java_POO.generics.dominio.Barco;
import java_POO.generics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> BarcosDisponiveis = new ArrayList<>(List.of(new Barco("lancha"), new Barco("canoa")));

    public Barco BuscarBarcosDisponiveis() {
        System.out.println("Buscando Barcos...");
        Barco barco = BarcosDisponiveis.remove(0);
        System.out.println("alugando Barco: " + barco);
        return barco;
    }
    public void RetornarBarco(Barco barco) {
        System.out.println("Barcos disponiveis: " + BarcosDisponiveis);
        System.out.println("devolvendo Barco: " + barco);
        BarcosDisponiveis.add(barco);
        System.out.println("Barcos disponiveis: " + BarcosDisponiveis);
    }
}
