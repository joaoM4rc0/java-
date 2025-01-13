package java_POO.Wcolecoes.list.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        Integer[] listToArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));

        Integer[] numerosArray = {1,2,3};

        List<Integer> numerosList = new ArrayList<>(Arrays.asList(listToArray));
        System.out.println("------------");
        numerosList.add(88);
        System.out.println(numerosList);
    }
}
