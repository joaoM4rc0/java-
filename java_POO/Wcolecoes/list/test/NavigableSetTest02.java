package java_POO.Wcolecoes.list.test;

import java_POO.Wcolecoes.list.dominio.Manga;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;
class MangaPrecoComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return Double.compare(manga1.getPreco(), manga2.getPreco());
    }
}
public class NavigableSetTest02 {
    public static void main(String[] args) {
        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(1, "berserk", 180.45, 0));
        mangas.add(new Manga(2L, "dandadan",145.8, 4));
        mangas.add(new Manga(8L, "One piece", 210.88, 0));
        mangas.add(new Manga(18L, "Jujutsu kaisen", 100.7, 2));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
