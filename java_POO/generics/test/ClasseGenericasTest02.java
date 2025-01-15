package java_POO.generics.test;

import java_POO.generics.dominio.Barco;
import java_POO.generics.dominio.Carro;
import java_POO.generics.service.CarroRentavelService;
import java_POO.generics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericasTest02 {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>(List.of(new Carro("BMW"), new Carro("gol quadrado")));
        List<Barco> barcos = new ArrayList<>(List.of(new Barco("caravela"), new Barco("titanic")));
        RentalService<Carro> rentalService1 = new RentalService<>(carros);
        RentalService<Barco> rentalService2 = new RentalService<>(barcos);

        Carro carro = rentalService1.BuscarObjetosDisponiveis();
        rentalService1.RetornarCarro(carro);

    }
}
