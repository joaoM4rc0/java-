package java_POO.Wcolecoes.list.test;

import java_POO.Wcolecoes.list.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(2L, "dandadan", 180.2));
        mangas.add(new Manga(8L, "One piece", 210.88));
        mangas.add(new Manga(18L, "Jujutsu kaisen", 100.7));
        mangas.add(new Manga(4L, "Berserk", 185.1));

        mangas.sort(mangaByIdComparator);

        for(Manga manga: mangas) {
            System.out.println(manga);
        }
        System.out.println("--------------");
        Manga mangaToSearch = new Manga(8L, "One piece", 210.88);
        System.out.println(Collections.binarySearch(mangas, mangaToSearch, mangaByIdComparator));

    }
}
