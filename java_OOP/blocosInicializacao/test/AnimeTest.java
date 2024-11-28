package java_OOP.blocosInicializacao.test;

import java_OOP.blocosInicializacao.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        for (int ep : anime.getEps()) {
            System.out.print(ep + " ");
        }
    }
}
