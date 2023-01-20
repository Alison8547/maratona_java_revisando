package br.com.maratonajava.collections.test;

import br.com.maratonajava.collections.domain.Consumidor;
import br.com.maratonajava.collections.domain.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest3 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Alison");
        Consumidor consumidor2 = new Consumidor("Julio");

        Manga manga1 = new Manga(4L, "Hunter X Hunter", 19.90, 1);
        Manga manga2 = new Manga(3L, "Dragon ball Z", 2.90, 2);
        Manga manga3 = new Manga(3L, "Shuumatsu no Valkirie", 4.90, 2);
        Manga manga4 = new Manga(1L, "Naruto", 23.90, 4);
        Manga manga5 = new Manga(2L, "Akira", 10.90, 9);

        List<Manga> listMangaConsumidor1 = List.of(manga1, manga4);
        List<Manga> listMangaConsumidor2 = List.of(manga2, manga3, manga5);

        Map<Consumidor, List<Manga>> consumidorListMap = new HashMap<>();

        consumidorListMap.put(consumidor1, listMangaConsumidor1);
        consumidorListMap.put(consumidor2, listMangaConsumidor2);


        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorListMap.entrySet()) {
            System.out.println("---" + entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println("-----" + manga.getNome());
            }
        }

    }
}
