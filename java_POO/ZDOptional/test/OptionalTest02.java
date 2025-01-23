package java_POO.ZDOptional.test;

import java_POO.ZDOptional.dominio.Manga;
import java_POO.ZDOptional.repositorio.RepositorioDeMangas;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> nomeManga = RepositorioDeMangas.procuraPorName("one piece");
        nomeManga.ifPresent(m -> m.setName("one piece 2"));
        System.out.println(nomeManga);
        Manga mangaPorId = RepositorioDeMangas.procuraPorId(1)
                .orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaPorId);
        Manga novoManga = RepositorioDeMangas.procuraPorName("dandadan")
                .orElse(new Manga("dandadan", 4, 78));
        System.out.println(novoManga);
    }

}
