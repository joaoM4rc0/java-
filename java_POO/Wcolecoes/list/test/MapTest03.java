package java_POO.Wcolecoes.list.test;

import java_POO.Wcolecoes.list.dominio.Consumidor;
import java_POO.Wcolecoes.list.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// consumidor compra um ou mais mangas
public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("joao marco");
        Consumidor consumidor2 = new Consumidor("davi");
        Consumidor consumidor3 = new Consumidor("letica");

        Manga manga1= new Manga(1, "berserk", 180.45, 0);
        Manga manga2 = new Manga(2L, "dandadan", 145.8, 4);
        Manga manga3 = new Manga(8L, "One piece", 210.88, 0);
        Manga manga4 = new Manga(18L, "Jujutsu kaisen", 100.7, 2);

        List<Manga> mangaEscolhido = List.of(manga1, manga4);
        List<Manga> mangaEscolhido2 = List.of(manga3, manga2,manga1);

        Map<Consumidor, List<Manga>> consumidorDeManga = new HashMap<>();
        consumidorDeManga.put(consumidor1,mangaEscolhido);
        consumidorDeManga.put(consumidor2,mangaEscolhido);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorDeManga.entrySet()) {
            System.out.println(entry.getKey().getNome() + ":") ;
            for (Manga manga : entry.getValue()) {
                System.out.println(manga.getNome());
            }
            System.out.println("---------------");
        }
    }
}
