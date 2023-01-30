package br.com.maratonajava.streams.test;

import br.com.maratonajava.streams.dominio.Category;
import br.com.maratonajava.streams.dominio.LightNovels;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsTest12 {
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
        Map<Category, List<LightNovels>> map = new HashMap<>();

        List<LightNovels> drama = new ArrayList<>();
        List<LightNovels> romance = new ArrayList<>();
        List<LightNovels> fantasy = new ArrayList<>();

        for (LightNovels lightNovels : lightNovelsList) {
            switch (lightNovels.getCategory()) {
                case DRAMA -> {
                    drama.add(lightNovels);
                }

                case FANTASY -> {
                    fantasy.add(lightNovels);
                }

                case ROMANCE -> {
                    romance.add(lightNovels);
                }
            }
        }

        map.put(Category.DRAMA, drama);
        map.put(Category.FANTASY, fantasy);
        map.put(Category.ROMANCE, romance);

        System.out.println(map);

        // mesma coisa que a gente fez acima só que usando stream bem fácil
        Map<Category, List<LightNovels>> map1 = lightNovelsList.stream().collect(Collectors.groupingBy(LightNovels::getCategory));

        System.out.println(map1);

    }
}
