package java_OOP.construtores.test;

import java_OOP.construtores.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("black clover", "animação", 170, "shounen", "Toei Animation");
        anime.imprime();
    }
}
