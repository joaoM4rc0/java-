package java_POO.ZDStream.test;

import java_POO.ZDStream.dominio.Category;
import java_POO.ZDStream.dominio.LightNovel;
import java_POO.ZDStream.dominio.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
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
//        Map<Promotion, List<LightNovel>> promotionListMap = lightNovels.stream().collect(Collectors.groupingBy(ln -> {
//            return ln.getPreco() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
//        }));
        Map<Category, Map<Promotion, List<LightNovel>>> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory,
                Collectors.groupingBy(ln -> {
                    return ln.getPreco() < 6 ? Promotion.NORMAL_PRICE : Promotion.NORMAL_PRICE;
                })
        ));
        System.out.println(collect);
    }
}

