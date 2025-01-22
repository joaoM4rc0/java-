package java_POO.ZCLambdas.test;

import java_POO.ZCLambdas.dominio.Anime;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
//        BiFunction<String, Integer, Anime> animeBiFunction = (nome, eps) -> new Anime(nome, eps);
        BiFunction<String, Integer, Anime> animeBiFunction = Anime::new;
        System.out.println(animeBiFunction.apply("one piece", 1078));
    }
}