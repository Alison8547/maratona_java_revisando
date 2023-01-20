package br.com.maratonajava.collections.test;

import br.com.maratonajava.collections.domain.Consumidor;
import br.com.maratonajava.collections.domain.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest2 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Alison");
        Consumidor consumidor2 = new Consumidor("Julio");

        Manga manga1 = new Manga(4L, "Hunter X Hunter", 19.90, 1);
        Manga manga2 = new Manga(3L, "Dragon ball Z", 2.90, 2);
        Manga manga3 = new Manga(3L, "Dragon ball Z", 4.90, 2);
        Manga manga4 = new Manga(1L, "Naruto", 23.90, 4);
        Manga manga5 = new Manga(2L, "Akira", 10.90, 9);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();

        consumidorManga.put(consumidor1, manga1);
        consumidorManga.put(consumidor2, manga4);


        for (Map.Entry<Consumidor, Manga> mangaEntry : consumidorManga.entrySet()) {
            System.out.println(mangaEntry.getKey().getNome() + " - " + mangaEntry.getValue().getNome());
        }

    }
}
