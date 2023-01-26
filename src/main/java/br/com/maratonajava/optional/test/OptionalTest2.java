package br.com.maratonajava.optional.test;

import br.com.maratonajava.optional.domain.Manga;
import br.com.maratonajava.optional.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest2 {
    public static void main(String[] args) {
        Optional<Manga> optionalManga = MangaRepository.findByTitle("Hunter x Hunter");
        optionalManga.ifPresent(manga -> manga.setTitle("Hunter x Hunter 2"));

        System.out.println(optionalManga);

        Manga manga = MangaRepository.findById(2).orElseThrow(IllegalArgumentException::new);

        System.out.println(manga);

        Manga newManga = MangaRepository.findByTitle("Naruto")
                .orElse(new Manga(3, "Naruto", 500));

        System.out.println(newManga);
        MangaRepository.mangaList.add(newManga);

        System.out.println(MangaRepository.mangaList);
    }
}
