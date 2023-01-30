package br.com.maratonajava.streams.test;

import br.com.maratonajava.streams.dominio.LightNovels;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamsTest2 {
    private static List<LightNovels> lightNovelsList = new ArrayList<>(List.of(
            new LightNovels("Kurama", 1.99),
            new LightNovels("Akira", 5.43),
            new LightNovels("Maide", 2.34),
            new LightNovels("Mamatsu", 6.43),
            new LightNovels("Orogatami", 1.22),
            new LightNovels("Miatusu", 9.99)
    ));

    public static void main(String[] args) {

        List<String> stringList = lightNovelsList.stream()
                .sorted(Comparator.comparing(LightNovels::getTitle))
                .filter(ls -> ls.getPrice() <= 4)
                .limit(3)
                .map(LightNovels::getTitle)
                .toList();

        System.out.println(stringList);

    }
}
