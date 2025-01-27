package java_POO.ZDStream.test;

import java_POO.ZDStream.dominio.Category;
import java_POO.ZDStream.dominio.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamTest13 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("youkoso jitsuryoko", 2.5, Category.DRAMA),
            new LightNovel("one punch man ", 2.7, Category.ACAO),
            new LightNovel("one piece", 3.7, Category.FANTASY),
            new LightNovel("dandandan", 5.8, Category.FANTASY),
            new LightNovel("overlord", 7.7, Category.FANTASY),
            new LightNovel("monogatari", 3.9, Category.ROMANCE)
    )
    );
    public static void main(String[] args) {
        Map<Category, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);
    }
}

