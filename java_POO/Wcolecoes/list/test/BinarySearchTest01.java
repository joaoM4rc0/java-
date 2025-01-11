package java_POO.Wcolecoes.list.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(1);
        numeros.add(7);
        numeros.add(2);

        Collections.sort(numeros);

        System.out.println("lista: " + numeros+ "posicao do numero " + Collections.binarySearch(numeros, 5));
        // se o valor nao existir ele retorna (-(ponto de inserção) -1)
        System.out.println("lista: " + numeros+ "posicao do numero " + Collections.binarySearch(numeros, 3));
    }
}
