package br.com.maratonajava.collections.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest1 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();
        nomes.add("Leona");
        nomes.add("Chris");
        nomes.add("Killua");

        nomes2.add("Kuroro");
        nomes2.add("Leorio");
        nomes2.add("Netero");

        nomes.addAll(nomes2);

        System.out.println(nomes.remove("Leona"));

        for (String list : nomes) {
            System.out.println(list);
        }

        System.out.println("--------");

        nomes.add("Gon");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(16);

        System.out.println(numeros);
    }
}
