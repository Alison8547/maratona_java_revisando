package br.com.maratonajava.streams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamsTest4 {
    public static void main(String[] args) {
        List<List<String>> company = new ArrayList<>();
        List<String> students = List.of("Kaio", "Matheus", "Diego souza");
        List<String> developer = List.of("Maicon", "Raffa Lazarri", "Maiton");
        List<String> gestao = List.of("Pietro", "Natalia");
        company.add(students);
        company.add(developer);
        company.add(gestao);

        for (List<String> stringList : company) {
            for (String names : stringList) {
                System.out.println(names);
            }
        }

        System.out.println("--------");

        // flatMap vai mais a fundo numa lista que tá dentro de uma lista

        company.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);

    }
}
