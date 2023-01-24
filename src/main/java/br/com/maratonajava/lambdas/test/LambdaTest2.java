package br.com.maratonajava.lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest2 {
    public static void main(String[] args) {
        List<String> strings = List.of("Zoro", "Sanji", "Sasuke");
        List<Integer> integers = map(strings, s -> s.length());
        List<String> mapString = map(strings, s -> s.toUpperCase());
        List<Character> characters = map(strings, s -> s.charAt(0));

        System.out.println(integers);
        System.out.println(mapString);
        System.out.println(characters);
    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T e : list) {
            R r = function.apply(e);
            result.add(r);
        }

        return result;
    }
}
