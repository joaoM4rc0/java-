package java_POO.Wcolecoes.list.test;

import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Integer> numeros = new TreeSet<>();

        numeros.add(5);
        numeros.add(1);
        numeros.add(3);
        numeros.add(6);

        for (Integer numero : numeros) {
            System.out.println(numero);
        }
        System.out.println("menor elemento: " + numeros.first());
        System.out.println("maior elemento: " + numeros.last());


    }
}
