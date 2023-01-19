package br.com.maratonajava.collections.test;

import br.com.maratonajava.collections.domain.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InteratorTest1 {
    public static void main(String[] args) {
        List<Manga> mangaList = new ArrayList<>();
        mangaList.add(new Manga(4L, "Hunter X Hunter", 19.90, 2));
        mangaList.add(new Manga(3L, "Dragon ball Z", 9.90, 0));
        mangaList.add(new Manga(1L, "Naruto", 23.90, 1));
        mangaList.add(new Manga(2L, "Akira", 10.90, 0));

//        Iterator<Manga> mangaIterator = mangaList.iterator();
//        while (mangaIterator.hasNext()) {
//            if (mangaIterator.next().getQuantidade() == 0) {
//                mangaIterator.remove();
//            }
//        }

        mangaList.removeIf(manga -> manga.getQuantidade() == 0);

        System.out.println(mangaList);
    }
}
