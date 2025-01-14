package java_POO.Wcolecoes.list.test;

import java_POO.Wcolecoes.list.dominio.Consumidor;
import java_POO.Wcolecoes.list.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("joao marco");
        Consumidor consumidor2 = new Consumidor("davi");
        Consumidor consumidor3 = new Consumidor("letica");

        Manga manga1= new Manga(1, "berserk", 180.45, 0);
        Manga manga2 = new Manga(2L, "dandadan", 145.8, 4);
        Manga manga3 = new Manga(8L, "One piece", 210.88, 0);
        Manga manga4 = new Manga(18L, "Jujutsu kaisen", 100.7, 2);
        Map<Consumidor, Manga> consumidorDeManga = new HashMap<>();
        consumidorDeManga.put(consumidor1, manga1);
        consumidorDeManga.put(consumidor2, manga3);
        consumidorDeManga.put(consumidor3, manga4);

        for (Map.Entry<Consumidor, Manga> entry : consumidorDeManga.entrySet()) {
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());
        }
    }
}
