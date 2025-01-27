package java_POO.ZDStream.test;

import java_POO.ZDStream.dominio.Category;
import java_POO.ZDStream.dominio.LightNovel;
import java_POO.ZDStream.dominio.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;


public class StreamTest14 {
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
//        Map<Category, Long> categoryLongMap = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));
//
//        Map<Category, Optional<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory,
//                Collectors.maxBy(Comparator.comparing(LightNovel::getPreco))));

        // Collectors.groupingBy para agrupar os LightNovel por categoria e,
        // em seguida, utilizando Collectors.collectingAndThen para aplicar a operação maxBy
        // e obter o valor máximo de preço em cada grupo, encapsulado em um Optional.
        // Optional::get é usado para extrair o valor do Optional.
        Map<Category, LightNovel> collect1 = lightNovels.stream().collect(
                Collectors.groupingBy(LightNovel::getCategory,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPreco)), Optional::get)));
        System.out.println(collect1);

        // essa foi uma recomendação do intellij, mas nao sei se tem alguma melhora no uso da memoria , ainda nao compreendo
        Map<Category, LightNovel> collect2 = lightNovels.stream().collect(
                Collectors.toMap(LightNovel::getCategory, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LightNovel::getPreco))));
        // BinaryOperator.maxBy é usado para resolver conflitos de chave
        // (quando mais de um LightNovel pertence à mesma categoria),
        // selecionando o de maior preço.

        // Se o desempenho e o uso de memória forem preocupações críticas,
        // a segunda abordagem (collect2) pode ser mais eficiente devido à eliminação de agrupamentos intermediários.
        // No entanto, a diferença pode ser insignificante para conjuntos de dados menores.
    }

}

