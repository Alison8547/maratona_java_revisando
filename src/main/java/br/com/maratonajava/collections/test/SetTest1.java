package br.com.maratonajava.collections.test;

import br.com.maratonajava.collections.domain.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest1 {
    public static void main(String[] args) {

        Set<Manga> mangaSet = new HashSet<>(); // não permite elementos duplicados e não mantém a ordem de insert
        //   Set<Manga> mangaSet = new LinkedHashSet<>(); // mantém a ordem de insert

        mangaSet.add(new Manga(4L, "Hunter X Hunter", 19.90, 1));
        mangaSet.add(new Manga(3L, "Dragon ball Z", 9.90, 2));
        mangaSet.add(new Manga(3L, "Dragon ball Z", 9.90, 2));
        mangaSet.add(new Manga(1L, "Naruto", 23.90, 4));
        mangaSet.add(new Manga(2L, "Akira", 10.90, 9));

        for (Manga manga : mangaSet) {
            System.out.println(manga);
        }
    }
}
