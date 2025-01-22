package java_POO.ZCLambdas.test;

import java_POO.ZCLambdas.dominio.Anime;
import java_POO.ZCLambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("davi", "mathias", "ronaldo"));
        list.sort(String::compareTo);
        BiPredicate<List<String>, String> checkdName = List::contains;
        System.out.println(checkdName);
    }
}