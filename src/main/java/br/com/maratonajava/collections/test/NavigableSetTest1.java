package br.com.maratonajava.collections.test;

import br.com.maratonajava.collections.domain.Manga;
import br.com.maratonajava.collections.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneCompareByMarca implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

public class NavigableSetTest1 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneCompareByMarca());
        set.add(new Smartphone("12", "Nokia"));
        set.add(new Smartphone("4422", "Iphone"));
        set.add(new Smartphone("5677", "Samsung"));
        set.add(new Smartphone("8788", "LG"));
        set.add(new Smartphone("8788", "LG"));

        for (Smartphone smartphone : set) {
            System.out.println(smartphone);
        }

        System.out.println("------------");

        NavigableSet<Manga> mangas = new TreeSet<>();
        mangas.add(new Manga(4L, "Hunter X Hunter", 19.90, 1));
        mangas.add(new Manga(3L, "Dragon ball Z", 2.90, 2));
        mangas.add(new Manga(3L, "Dragon ball Z", 4.90, 2));
        mangas.add(new Manga(1L, "Naruto", 23.90, 4));
        mangas.add(new Manga(2L, "Akira", 10.90, 9));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("------------");

        Manga bleach = new Manga(14L, "Bleach", 5.0);

        System.out.println(mangas.lower(bleach));
        System.out.println(mangas.higher(bleach));
        System.out.println(mangas.floor(bleach));
        System.out.println(mangas.ceiling(bleach));

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.size());
        System.out.println(mangas.pollLast());
        System.out.println(mangas.size());

    }
}
