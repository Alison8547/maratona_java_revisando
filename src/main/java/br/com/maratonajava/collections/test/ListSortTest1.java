package br.com.maratonajava.collections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest1 {
    public static void main(String[] args) {
        List<String> jogos = new ArrayList<>();
        jogos.add("Yugioh");
        jogos.add("Homem-Aranha");
        jogos.add("GodOfWar");
        jogos.add("Sekiro");
        jogos.add("Crash");


        Collections.sort(jogos);

        for (String jogo : jogos) {
            System.out.println(jogo);
        }


        List<Double> salarios = new ArrayList<>();
        salarios.add(2200.0);
        salarios.add(1200.00);
        salarios.add(1100.50);
        salarios.add(3000.0);

        Collections.sort(salarios);

        System.out.println(salarios);


    }
}
