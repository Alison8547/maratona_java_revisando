package br.com.maratonajava.streams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsTest9 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println();
        IntStream.range(1, 50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println();

        Stream.of("KAME ", " KAME", " HAAA")
                .map(String::toUpperCase)
                .forEach(s -> System.out.print(s + " "));
        System.out.println();

        int[] array = {1, 2, 3, 4, 5};

        Arrays.stream(array)
                .average()
                .ifPresent(System.out::println);

        try (Stream<String> linesStream = Files.lines(Paths.get("file.txt"))) {

            linesStream.filter(s -> s.contains("Java")).forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
