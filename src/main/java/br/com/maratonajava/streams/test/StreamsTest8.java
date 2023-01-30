package br.com.maratonajava.streams.test;

import br.com.maratonajava.streams.dominio.LightNovels;

import java.util.ArrayList;
import java.util.List;

public class StreamsTest8 {
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

        lightNovelsList.stream()
                .map(LightNovels::getPrice)
                .filter(price -> price > 4)
                .reduce(Double::sum)
                .ifPresent(System.out::println);


        double sum = lightNovelsList.stream()
                .mapToDouble(LightNovels::getPrice)
                .filter(price -> price > 4)
                .sum();

        System.out.println(sum);
    }
}
