package java_POO.generics.service;

import java_POO.generics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class RentalService<T> {
    private List<T> objetosDisponiveis;
    public RentalService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }
    public T BuscarObjetosDisponiveis() {
        System.out.println("Buscando objetos...");
        T t = objetosDisponiveis.remove(0);
        System.out.println("alugando objeto: " + t);
        return t;
    }
    public void RetornarCarro(T objetos) {
        System.out.println("objetos disponiveis: " + objetosDisponiveis);
        System.out.println("devolvendo objeto: " + objetos);
        objetosDisponiveis.add(objetos);
        System.out.println("objetos disponiveis: " + objetosDisponiveis);
    }
}
