package java_POO.ZDStream.test;

import java_POO.ZDStream.dominio.Category;
import java_POO.ZDStream.dominio.LightNovel;
import java_POO.ZDStream.dominio.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;


public class StreamTest15 {
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

        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.summarizingDouble(LightNovel::getPreco)));
        System.out.println(collect);
        System.out.println("---------------");
        Map<Category, Set<Promotion>> collect1 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(StreamTest15::getPromotion, Collectors.toSet())));
        System.out.println(collect1);
    }
    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPreco() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }
}

