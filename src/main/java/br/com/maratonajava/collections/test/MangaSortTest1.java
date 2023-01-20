package br.com.maratonajava.collections.test;

import br.com.maratonajava.collections.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaComparatorId implements Comparator<Manga> {

    @Override
    public int compare(Manga o1, Manga o2) {
        return o1.getId().compareTo(o2.getId());
    }
}

class MangaComparatorPreco implements Comparator<Manga> {

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class MangaSortTest1 {
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

        System.out.println("-------------");

        Collections.sort(mangaList, new MangaComparatorId());

        for (Manga manga : mangaList) {
            System.out.println(manga);
        }
    }
}
