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
        Map<Category, List<LightNovel>> categoryLightNovel = new HashMap<>();
            List<LightNovel> drama =new ArrayList<>();
            List<LightNovel> acao =new ArrayList<>();
            List<LightNovel> romance =new ArrayList<>();
            List<LightNovel> fantasy =  new ArrayList<>();
        for (LightNovel lightNovel : lightNovels) {
            switch (lightNovel.getCategory()) {
                case ACAO: acao.add(lightNovel); break;
                case DRAMA: drama.add(lightNovel); break;
                case FANTASY: fantasy.add(lightNovel); break;
                case ROMANCE: romance.add(lightNovel); break;
            }
        }
        categoryLightNovel.put(Category.ACAO, acao);
        categoryLightNovel.put(Category.DRAMA, drama);
        categoryLightNovel.put(Category.ROMANCE, romance);
        categoryLightNovel.put(Category.FANTASY, fantasy);

        System.out.println(categoryLightNovel);
    }
}

