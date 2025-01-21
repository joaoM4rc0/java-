package java_POO.ZCLambdas.test;

import java_POO.ZCLambdas.dominio.Anime;
import java_POO.ZCLambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("berserk", 45), new Anime("one piece", 1050), new Anime("black clover", 170)));

//        Collections.sort(animeList, (a1, a2) -> a1.getName().compareTo(a2.getName()));
//        animeList.sort(AnimeComparators::compareByTitle);
        animeList.sort(AnimeComparators::compareByEps);
        System.out.println(animeList);
    }
}
