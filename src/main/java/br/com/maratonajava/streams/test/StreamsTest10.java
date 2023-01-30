package br.com.maratonajava.streams.test;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamsTest10 {
    public static void main(String[] args) {
        Stream.iterate(1, n -> n + 2)
                .limit(10)
                .forEach(System.out::println);


        // sequencia de fibonacci
        /*
        0,1
        1,1
        1,2
        3,4
        8,
         */

        Stream.iterate(new int[]{0, 1}, i -> new int[]{i[1], i[0] + i[1]})
                .limit(14)
                .forEach(l -> System.out.println(Arrays.toString(l)));


        Stream.iterate(new int[]{0, 1}, i -> new int[]{i[1], i[0] + i[1]})
                .limit(14)
                .map(m -> m[0])
                .forEach(System.out::println);
    }
}
