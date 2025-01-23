package java_POO.ZDOptional.repositorio;

import java_POO.ZDOptional.dominio.Manga;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;

public class RepositorioDeMangas {
    private static List<Manga> mangaList = new ArrayList<>(List.of(new Manga("jujutsu kaisen",1, 150 ), new Manga("one piece", 5, 1200)));
    public static Optional<Manga> procuraPorName(String name) {
        return procuraAlgo(m -> m.getName().equals(name));
    }
    public static Optional<Manga> procuraPorId(Integer id) {
        return procuraAlgo(m -> m.getId().equals(id));
    }
    private static Optional<Manga> procuraAlgo(Predicate<Manga> predicate) {
        Manga found =null;
        for (Manga manga : mangaList) {
            if (predicate.test(manga)) {
                found = manga;
            }
        }
        return Optional.ofNullable(found);
    }
}
