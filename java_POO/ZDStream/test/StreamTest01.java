package java_POO.ZDStream.test;

import java_POO.ZDStream.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// ordernar por title
// retornar 3 light novels com valor menor do que 4
public class StreamTest01 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
                    new LightNovel("youkoso jitsuryoko", 2.5),
                    new LightNovel("one punch man ", 2.7),
                    new LightNovel("one piece", 3.7),
                    new LightNovel("dandandan", 5.8),
                    new LightNovel("overlord", 7.7),
                    new LightNovel("monogatari", 3.2)
    )
    );
    public static void main(String[] args) {
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
        System.out.println(lightNovels);
    }
}
