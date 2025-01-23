package java_POO.ZDStream.test;

import java_POO.ZDStream.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// ordernar por title
// retornar 3 light novels com valor menor do que 4

//resolvido
public class StreamTest02 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
                    new LightNovel("youkoso jitsuryoko", 2.5),
                    new LightNovel("one punch man ", 2.7),
                    new LightNovel("one piece", 3.7),
                    new LightNovel("dandandan", 5.8),
                    new LightNovel("overlord", 7.7),
                    new LightNovel("monogatari", 3.9)
    )
    );
    public static void main(String[] args) {
        List<String> title = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(l -> l.getPreco() <= 4)
                .limit(3)
                .map(LightNovel::getTitle)
                .collect(Collectors.toList());
        System.out.println(title);
    }
}
