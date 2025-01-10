package java_POO.Wcolecoes.list.test;

import java.util.ArrayList;
import java.util.List;

public class dListTest01 {
    public static void main(String[] args) {
        List<String>nomes = new ArrayList<>();
        List<String>nomes2 = new ArrayList<>();
        nomes.add("joao");
        nomes.add("maria");
        nomes2.add("jonas");
        nomes2.add("marcio");
        nomes.addAll(nomes2);
        for (String nome : nomes) {
            System.out.println(nome);
        }

    }
}
