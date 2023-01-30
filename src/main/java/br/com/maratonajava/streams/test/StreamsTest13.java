package br.com.maratonajava.streams.test;

import br.com.maratonajava.streams.dominio.Category;
import br.com.maratonajava.streams.dominio.LightNovels;
import br.com.maratonajava.streams.dominio.Promotion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsTest13 {
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
        Map<Promotion, List<LightNovels>> groupingByPromotion = lightNovelsList.stream()
                .collect(Collectors.groupingBy(ls -> ls.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE));

        System.out.println(groupingByPromotion);


        Map<Category, Map<Promotion, List<LightNovels>>> groupingByCategoryAndPromotion = lightNovelsList.stream()
                .collect(Collectors.groupingBy(LightNovels::getCategory, Collectors.groupingBy(ls -> ls.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE)));

        System.out.println(groupingByCategoryAndPromotion);
    }
}
