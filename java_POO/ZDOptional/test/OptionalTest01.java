package java_POO.ZDOptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> name = FindName("joao");
        String empty = name.orElse("valor vazio");
        name.ifPresent(s -> System.out.println(s.toUpperCase()));
    }
    private static Optional<String> FindName(String name) {
        List<String> list = List.of("joao", "marco","davi");
        int i = list.indexOf(name);
        if (i != -1) {
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }
}
