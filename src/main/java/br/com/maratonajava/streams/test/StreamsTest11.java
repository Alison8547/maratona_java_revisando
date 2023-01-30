package br.com.maratonajava.streams.test;

import br.com.maratonajava.streams.dominio.LightNovels;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest11 {
    private static List<LightNovels> lightNovelsList = new ArrayList<>(List.of(
            new LightNovels("Kurama", 1.99),
            new LightNovels("Akira", 5.43),
            new LightNovels("Maide", 2.34),
            new LightNovels("Mamatsu", 6.43),
            new LightNovels("Orogatami", 1.22),
            new LightNovels("Orogatami", 1.22),
            new LightNovels("Miatusu", 9.99),
            new LightNovels("Kaisen Nomoragati", 23.99)
    ));

    public static void main(String[] args) {
        System.out.println(lightNovelsList.stream().count());
        System.out.println(lightNovelsList.stream().collect(Collectors.counting()));

        double sum = lightNovelsList.stream()
                .mapToDouble(LightNovels::getPrice)
                .sum();
        System.out.println(sum);

        System.out.println(lightNovelsList.stream().collect(Collectors.summingDouble(LightNovels::getPrice)));


        lightNovelsList.stream()
                .mapToDouble(LightNovels::getPrice)
                .average()
                .ifPresent(System.out::println);

        System.out.println(lightNovelsList.stream().collect(Collectors.averagingDouble(LightNovels::getPrice)));


        DoubleSummaryStatistics doubleSummaryStatistics = lightNovelsList.stream().collect(Collectors.summarizingDouble(LightNovels::getPrice));
        System.out.println(doubleSummaryStatistics);

        String titles = lightNovelsList.stream().map(LightNovels::getTitle).collect(Collectors.joining(", "));
        System.out.println(titles);

    }
}
