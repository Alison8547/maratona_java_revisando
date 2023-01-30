package br.com.maratonajava.streams.test;

import br.com.maratonajava.streams.dominio.Category;
import br.com.maratonajava.streams.dominio.LightNovels;
import br.com.maratonajava.streams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsTest14 {
    private static List<LightNovels> lightNovelsList = new ArrayList<>(List.of(
            new LightNovels("Kurama", 1.99, Category.FANTASY),
            new LightNovels("Akira", 5.43, Category.FANTASY),
            new LightNovels("Maide", 2.34, Category.ROMANCE),
            new LightNovels("Mamatsu", 6.43, Category.FANTASY),
            new LightNovels("Orogatami", 1.22, Category.DRAMA),
            new LightNovels("Orogatami", 1.22, Category.DRAMA),
            new LightNovels("Miatusu", 9.99, Category.ROMANCE),
            new LightNovels("Kaisen Nomoragati", 23.99, Category.FANTASY)
    ));

    public static void main(String[] args) {
        Map<Category, Long> collect1 = lightNovelsList.stream().collect(Collectors.groupingBy(LightNovels::getCategory, Collectors.counting()));

        System.out.println(collect1);

        Map<Category, Optional<LightNovels>> collect2 = lightNovelsList.stream()
                .collect(Collectors.groupingBy(LightNovels::getCategory, Collectors.maxBy(Comparator.comparing(LightNovels::getPrice))));
        System.out.println(collect2);

        Map<Category, LightNovels> collect3 = lightNovelsList.stream()
                .collect(Collectors.groupingBy(LightNovels::getCategory,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovels::getPrice)), Optional::get)));

        System.out.println(collect3);


    }
}
