package java_POO.Wcolecoes.list.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();
        mangas.add("dandadan");
        mangas.add("One piece");
        mangas.add("Jujutsu kaisen");
        mangas.add("Berserk");
        Collections.sort(mangas);
        for (String manga : mangas) {
            System.out.println(manga);
        }
    }
}
