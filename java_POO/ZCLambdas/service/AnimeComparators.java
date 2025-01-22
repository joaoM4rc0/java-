package java_POO.ZCLambdas.service;

import java_POO.ZCLambdas.dominio.Anime;

public class  AnimeComparators {
    public static int compareByTitle(Anime a1, Anime a2) {
        return a1.getName().compareTo(a2.getName());
    }
    public static int compareByEps(Anime a1, Anime a2) {
        return Integer.compare(a1.getEps(), a2.getEps());
    }
    public int compareByEpsNoStatic(Anime a1, Anime a2) {
        return Integer.compare(a1.getEps(), a2.getEps());
    }
}
