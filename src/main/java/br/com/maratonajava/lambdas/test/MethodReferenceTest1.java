package br.com.maratonajava.lambdas.test;

import br.com.maratonajava.lambdas.domain.Anime;
import br.com.maratonajava.lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
// Method Reference static
public class MethodReferenceTest1 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(
                List.of(
                        new Anime("Hunter x Hunter", 148),
                        new Anime("Death Note", 48),
                        new Anime("Akira", 25),
                        new Anime("Bleach", 250)));

        //  animeList.sort((a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
        //  animeList.sort(AnimeComparators::compareByTitles);
        animeList.sort(AnimeComparators::compareByEpisodes);


        System.out.println(animeList);
    }
}
