package java_OOP.sobrecargaDeMetodos.test;

import java_OOP.sobrecargaDeMetodos.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("black clover", "animação", 170, "shounen");
        anime.imprime();
    }
}
