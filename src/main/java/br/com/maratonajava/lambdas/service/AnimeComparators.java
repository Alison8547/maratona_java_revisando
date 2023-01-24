package br.com.maratonajava.lambdas.service;

import br.com.maratonajava.lambdas.domain.Anime;

public class AnimeComparators {
    public static int compareByTitles(Anime a1, Anime a2) {
        return a1.getTitle().compareTo(a2.getTitle());
    }

    public static int compareByEpisodes(Anime a1, Anime a2) {
        return Integer.compare(a1.getEpisodes(), a2.getEpisodes());
    }

    public int compareByTitlesNoStatic(Anime a1, Anime a2) {
        return a1.getTitle().compareTo(a2.getTitle());
    }
}
