package java_POO.ZDStream.test;

import java_POO.ZDStream.dominio.LightNovel;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamTest12 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("youkoso jitsuryoko", 2.5),
            new LightNovel("one punch man ", 2.7),
            new LightNovel("one piece", 3.7),
            new LightNovel("one piece", 3.7),
            new LightNovel("dandandan", 5.8),
            new LightNovel("overlord", 7.7),
            new LightNovel("monogatari", 3.9)
    )
    );
    public static void main(String[] args) {
        Map<String, List<LightNovel>> mapLightNovels = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getTitle));
        System.out.println(" " + mapLightNovels.put("youkoso jitsuryoko", lightNovels));
    }
}

