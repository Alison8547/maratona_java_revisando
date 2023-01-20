package br.com.maratonajava.collections.test;

import br.com.maratonajava.collections.domain.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest2 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaComparatorPreco().reversed());

        mangas.add(new Manga(4L, "Hunter X Hunter", 19.90, 2));
        mangas.add(new Manga(3L, "Dragon ball Z", 2.90, 2));
        mangas.add(new Manga(3L, "Dragon ball Z", 4.90, 2));
        mangas.add(new Manga(1L, "Naruto", 23.90, 4));
        mangas.add(new Manga(2L, "Akira", 10.90, 9));


        while (!mangas.isEmpty()) {
            System.out.println(mangas.poll());
        }

    }
}
