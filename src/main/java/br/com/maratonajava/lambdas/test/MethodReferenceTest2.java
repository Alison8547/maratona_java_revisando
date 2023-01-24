package br.com.maratonajava.lambdas.test;

import br.com.maratonajava.lambdas.domain.Anime;
import br.com.maratonajava.lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

// Method Reference object
public class MethodReferenceTest2 {
    public static void main(String[] args) {

        List<Anime> animeList = new ArrayList<>(
                List.of(
                        new Anime("Hunter x Hunter", 148),
                        new Anime("Death Note", 48),
                        new Anime("Akira", 25),
                        new Anime("Bleach", 250)));

        AnimeComparators animeComparators = new AnimeComparators();

        animeList.sort(animeComparators::compareByTitlesNoStatic);

        System.out.println(animeList);

    }
}
