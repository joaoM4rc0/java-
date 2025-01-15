package java_POO.generics.test;

import java_POO.generics.dominio.Carro;
import java_POO.generics.service.CarroRentavelService;

public class ClasseGenericasTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.BuscarCarrosDisponiveis();
        System.out.println(carro);
        carroRentavelService.RetornarCarro(carro);

    }
}
