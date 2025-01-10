package java_POO.Wcolecoes.list.test;

import java.util.ArrayList;
import java.util.List;

public class dListTest01 {
    public static void main(String[] args) {
        List<String>nomes = new ArrayList<>();
        nomes.add("joao");
        nomes.add("maria");
        for (String nome : nomes) {
            System.out.println(nome);
        }
        for(int i = 0 ; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}
