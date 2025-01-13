package java_POO.Wcolecoes.list.test;

import java_POO.Wcolecoes.list.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(1, "berserk", 180.45, 0));
        mangas.add(new Manga(2L, "dandadan",145.8, 4));
        mangas.add(new Manga(8L, "One piece", 210.88, 0));
        mangas.add(new Manga(18L, "Jujutsu kaisen", 100.7, 2));
//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while(mangaIterator.hasNext()) {
//            if (mangaIterator.next().getQuantidade() == 0) {
//                mangaIterator.remove();
//            }
//        }
        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);

    }
}
