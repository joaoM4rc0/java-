package java_POO.ZDStream.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest05 {
    public static void main(String[] args) {
        List<String> palavras = List.of("oi", "eu", "sou", "o", "goku");

        List<String> letras = palavras.stream()
                .map(p -> p.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
        System.out.println(letras);

        //no map eu separo cada letras por aspas
        // no flatmap eu "achato" minha lista pq ela tava assim list<String[]> e ficou assim stream<String>
        //e no collect eu coletei todas as alterações e coloquei em uma lista
    }
}
