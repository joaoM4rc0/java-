package java_POO.ZDStream.test;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamTest10 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1,2,5,8,9);

        IntSummaryStatistics numeroColetado = numeros.stream().collect(Collectors.summarizingInt(Integer::intValue));

        System.out.println("retorna o maior numero da lista: " + numeroColetado.getMax());
        System.out.println("retorna a soma dos numeros da lista: " + numeroColetado.getSum());
    }
}

