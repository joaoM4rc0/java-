package java_POO.ZDStream.test;

import java_POO.ZDStream.dominio.LightNovel;

import java.util.*;

// ordernar por title
// retornar 3 light novels com valor menor do que 4
// resolvido
public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> corinthians = new ArrayList<>();
        List<String> goleiros = List.of("hugo souza", "doneli");
        List<String> zagueiros = List.of("caca", "andre ramalho", "joao pedro");
        List<String> atacantes = List.of("yuri alberto", "depay", "tales magno");
        corinthians.add(goleiros);
        corinthians.add(zagueiros);
        corinthians.add(atacantes);

//        for (List<String> elenco : corinthians) {
//            for (String jogador : elenco) {
//                System.out.println(jogador);
//            }
//        }
        System.out.println("---------");

        corinthians.stream().flatMap(Collection::stream).sorted().forEach(System.out::println);
    }
}
