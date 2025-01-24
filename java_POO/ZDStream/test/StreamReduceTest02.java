package java_POO.ZDStream.test;

import java_POO.ZDStream.dominio.LightNovel;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamReduceTest02 {
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
        DecimalFormat df = new DecimalFormat("#.##");
        Double valorLista = lightNovels.stream()
                .map(LightNovel::getPreco)
                .filter(preco -> preco > 3)
                .reduce(0.0, Double::sum);

        System.out.println(df.format(valorLista));
    }
}
