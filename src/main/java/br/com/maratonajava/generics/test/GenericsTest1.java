package br.com.maratonajava.generics.test;

import br.com.maratonajava.collections.domain.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest1 {
    public static void main(String[] args) {
        // Type erasure
        List<String> nomes = new ArrayList<>();
        nomes.add("Meruem");
        nomes.add("Pitou");

        for (String nome : nomes) {
            System.out.println(nome);
        }

        add(nomes, new Consumidor("Alison"));

        for (Object o : nomes) {
            System.out.println(o);
        }
    }


    private static void add(List list, Consumidor consumidor) {
        list.add(consumidor);
    }
}
