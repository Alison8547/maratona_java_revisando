package br.com.maratonajava.streams.test;

import java.util.Arrays;
import java.util.List;

public class StreamsTest5 {
    public static void main(String[] args) {
        List<String> word = List.of("Gomu", "Gomu", "no", "mi");

        String[] split = word.get(0).split("");
        System.out.println(Arrays.toString(split));


        List<String> letters = word.stream()
                .map(s -> s.split(""))
                .flatMap(Arrays::stream)
                .toList();

        System.out.println(letters);
    }
}
