package br.com.maratonajava.poo.sobrecarga.test;

import br.com.maratonajava.poo.sobrecarga.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Naruto", "TV", "Shounnen", 250);
        System.out.println(anime.getNome());
        System.out.println(anime.getTipo());
        System.out.println(anime.getGenero());
        System.out.println(anime.getEpisodios());
    }
}
