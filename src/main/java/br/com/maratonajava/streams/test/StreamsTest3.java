package br.com.maratonajava.streams.test;

import br.com.maratonajava.streams.dominio.LightNovels;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamsTest3 {
    private static List<LightNovels> lightNovelsList = new ArrayList<>(List.of(
            new LightNovels("Kurama", 1.99),
            new LightNovels("Akira", 5.43),
            new LightNovels("Maide", 2.34),
            new LightNovels("Mamatsu", 6.43),
            new LightNovels("Orogatami", 1.22),
            new LightNovels("Orogatami", 1.22),
            new LightNovels("Miatusu", 9.99)
    ));

    public static void main(String[] args) {

        lightNovelsList.forEach(System.out::println);

        long count = lightNovelsList.stream().distinct()
                .filter(ls -> ls.getPrice() <= 4)
                .count();

        System.out.println(count);

    }
}
