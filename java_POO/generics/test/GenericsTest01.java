package java_POO.generics.test;

import java_POO.Wcolecoes.list.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("joao");
        nomes.add("joao");
        for (String nome: nomes) {
            System.out.println(nome);
        }
        add(nomes, new Consumidor("marco"));
        for (String nome: nomes) {
            System.out.println(nome);
            // da erro: ClassCastException
        }
    }
    private static <T> void add(List<T> list, Consumidor consumidor) {
//        list.add(consumidor);
    }
}