package br.com.maratonajava.streams.test;

import br.com.maratonajava.streams.dominio.LightNovels;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamsTest1 {
    private static List<LightNovels> lightNovelsList = new ArrayList<>(List.of(
            new LightNovels("Kurama", 1.99),
            new LightNovels("Akira", 5.43),
            new LightNovels("Maide", 2.34),
            new LightNovels("Mamatsu", 6.43),
            new LightNovels("Orogatami", 1.22),
            new LightNovels("Miatusu", 9.99)
    ));

    // 1. ordernar a lista
    // 2. pegar os titles que são os prices são menores igual a 4
    public static void main(String[] args) {
        lightNovelsList.sort(Comparator.comparing(LightNovels::getTitle));
        System.out.println(lightNovelsList);
        List<String> titles = new ArrayList<>();
        for (LightNovels lightNovels : lightNovelsList) {
            if (lightNovels.getPrice() <= 4) {
                titles.add(lightNovels.getTitle());
            }

            if (titles.size() == 3) {
                break;
            }
        }

        System.out.println(titles);

//        List<LightNovels> lightNovels = lightNovelsList.stream()
//                .sorted(Comparator.comparing(LightNovels::getTitle))
//                .filter(manga -> manga.getPrice() <= 4)
//                .limit(3)
//                .toList();
//
//        List<String> titles = new ArrayList<>();
//
//        for (LightNovels lightNovel : lightNovels) {
//            titles.add(lightNovel.getTitle());
//        }
//
//        System.out.println(titles);

    }
}
