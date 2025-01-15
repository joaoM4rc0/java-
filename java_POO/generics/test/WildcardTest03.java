package java_POO.generics.test;

import java.util.List;

public class WildcardTest03 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        printConsulta(cachorros);
    }
    private static void printConsulta(List<? extends Animal> animals) {
        for (Animal animal: animals) {
            animal.consulta();
        }
    }
}
