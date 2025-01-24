package java_POO.ZDStream.test;

import java_POO.ZDStream.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

// ordernar por title
// retornar 3 light novels com valor menor do que 4
public class StreamTest07 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
    }
}
