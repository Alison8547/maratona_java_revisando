package br.com.maratonajava.lambdas.test;

import br.com.maratonajava.lambdas.domain.Anime;
import br.com.maratonajava.lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest4 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> animeComparatorsSupplier = AnimeComparators::new;
        AnimeComparators animeComparators = animeComparatorsSupplier.get();
        List<Anime> animeList = new ArrayList<>(
                List.of(
                        new Anime("Hunter x Hunter", 148),
                        new Anime("Death Note", 48),
                        new Anime("Akira", 25),
                        new Anime("Bleach", 250)));

        animeList.sort(animeComparators::compareByTitlesNoStatic);

        System.out.println(animeList);

        //  BiFunction<String,Integer,Anime> lambda = (title,episodes) -> new Anime(title,episodes);
        BiFunction<String, Integer, Anime> biFunction = Anime::new;
        Anime anime = biFunction.apply("One piece", 1023);
        System.out.println(anime);

    }
}
