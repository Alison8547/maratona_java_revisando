package br.com.maratonajava.optional.repositorio;

import br.com.maratonajava.optional.domain.Manga;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    public static List<Manga> mangaList = new ArrayList<>(List.of(new Manga(1, "Hunter x Hunter", 380), new Manga(2, "Jujutsu Kaisen", 250)));


    public static Optional<Manga> findById(Integer id) {
        return findBy(manga -> manga.getId().equals(id));
    }

    public static Optional<Manga> findByTitle(String title) {
        return findBy(manga -> manga.getTitle().equals(title));
    }

    public static Optional<Manga> findBy(Predicate<Manga> predicate) {
        Manga found = null;
        for (Manga manga : mangaList) {
            if (predicate.test(manga)) {
                found = manga;
            }
        }
        return Optional.ofNullable(found);
    }
}
