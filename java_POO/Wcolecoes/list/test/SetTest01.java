package java_POO.Wcolecoes.list.test;

import java_POO.Wcolecoes.list.dominio.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new LinkedHashSet<>();
        mangas.add(new Manga(1, "berserk", 180.45, 0));
        mangas.add(new Manga(2L, "dandadan",145.8, 4));
        mangas.add(new Manga(8L, "One piece", 210.88, 0));
        mangas.add(new Manga(18L, "Jujutsu kaisen", 100.7, 2));

        for(Manga manga: mangas) {
            System.out.println(manga);
        }
    }
}
