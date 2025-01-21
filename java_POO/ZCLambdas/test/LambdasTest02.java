package java_POO.ZCLambdas.test;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdasTest02 {
    public static void main(String[] args) {
        List<String> strings = List.of("luffy", "kuzan", "zoro", "juiza sim");
        forEach(strings,s -> System.out.println(s));
    }
    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }

    }
}
