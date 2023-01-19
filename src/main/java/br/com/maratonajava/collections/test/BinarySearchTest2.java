package br.com.maratonajava.collections.test;

import br.com.maratonajava.collections.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest2 {
    public static void main(String[] args) {
        List<Manga> mangaList = new ArrayList<>();
        mangaList.add(new Manga(4L, "Hunter X Hunter", 19.90));
        mangaList.add(new Manga(3L, "Dragon ball Z", 9.90));
        mangaList.add(new Manga(1L, "Naruto", 23.90));
        mangaList.add(new Manga(2L, "Akira", 10.90));

        Collections.sort(mangaList);

        for (Manga manga : mangaList) {
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(3L, "Dragon ball Z", 9.90);

        System.out.println(Collections.binarySearch(mangaList, mangaToSearch));

        mangaList.sort(new MangaComparatorId());

        System.out.println(mangaList);

        System.out.println(Collections.binarySearch(mangaList, mangaToSearch, new MangaComparatorId()));
    }
}
