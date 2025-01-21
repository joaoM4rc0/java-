package java_POO.ZCLambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdasTest03 {
    public static void main(String[] args) {
        List<String> string = List.of("naruto", "imak", "sukuna");
        List<Integer> map = map(string, s -> s.length());
        System.out.println(map);
    }
    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> resul = new ArrayList<>();
        for (T e : list) {
            R r = function.apply(e);
            resul.add(r);
        }
        return resul;
    }
}
