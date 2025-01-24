package java_POO.ZDStream.test;

import java_POO.ZDStream.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// ordernar por title
// retornar 3 light novels com valor menor do que 4
public class StreamTest06 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
                    new LightNovel("youkoso jitsuryoko", 2.5),
                    new LightNovel("one punch man ", 2.7),
                    new LightNovel("one piece", 3.7),
                    new LightNovel("dandandan", 5.8),
                    new LightNovel("overlord", 8.5),
                    new LightNovel("monogatari", 3.9)
    )
    );
    public static void main(String[] args) {
//        List<LightNovel> lista = lightNovels.stream().filter(ln -> ln.getPreco() > 8.0).collect(Collectors.toList());
//        System.out.println(lista);

        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPreco() > 8.0));
        System.out.println(lightNovels.stream().allMatch(ln -> ln.getPreco() > 0));

        lightNovels.stream()
                .filter(ln -> ln.getPreco() > 3)
                .sorted(Comparator.comparing(LightNovel::getPreco).reversed())
                .findAny()
                .ifPresent(System.out::println);
        lightNovels.stream()
                .filter(ln -> ln.getPreco() < 3)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
