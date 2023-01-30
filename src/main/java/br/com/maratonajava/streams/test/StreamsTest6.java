package br.com.maratonajava.streams.test;

import br.com.maratonajava.streams.dominio.LightNovels;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamsTest6 {
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

        System.out.println(lightNovelsList.stream().anyMatch(ls -> ls.getPrice() > 0));
        System.out.println(lightNovelsList.stream().allMatch(ls -> ls.getPrice() > 0));
        System.out.println(lightNovelsList.stream().noneMatch(ls -> ls.getPrice() < 0));

        lightNovelsList.stream()
                .filter(ls -> ls.getPrice() > 4)
                .findAny()
                .ifPresent(System.out::println);


        lightNovelsList.stream()
                .filter(ls -> ls.getPrice() > 4)
                .sorted(Comparator.comparing(LightNovels::getPrice).reversed())
                .findFirst()
                .ifPresent(System.out::println);
        // mesma coisa
        lightNovelsList.stream()
                .filter(ls -> ls.getPrice() > 4).max(Comparator.comparing(LightNovels::getPrice))
                .ifPresent(System.out::println);
    }
}
