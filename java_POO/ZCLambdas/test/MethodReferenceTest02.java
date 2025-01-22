package java_POO.ZCLambdas.test;

import java_POO.ZCLambdas.dominio.Anime;
import java_POO.ZCLambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("berserk", 45), new Anime("one piece", 1050), new Anime("black clover", 170)));
        animeList.sort(animeComparators::compareByEpsNoStatic);
        System.out.println(animeList);
    }
}
