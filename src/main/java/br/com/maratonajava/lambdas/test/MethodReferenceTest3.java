package br.com.maratonajava.lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReferenceTest3 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(List.of("Kakashi", "Naruto", "Madara", "Pain"));
        stringList.sort(String::compareTo);
        System.out.println(stringList);


        Function<String, Integer> function = Integer::parseInt;

        System.out.println(function.apply("10"));

        BiPredicate<List<String>, String> filterNameContains = List::contains;

        System.out.println(filterNameContains.test(stringList, "Kakashi"));
    }
}
