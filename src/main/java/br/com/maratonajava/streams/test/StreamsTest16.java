package br.com.maratonajava.streams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamsTest16 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 10_000_000;
        sumFor(num);
        sumIteratorStream(num);
        sumIteratorStreamParallel(num);
        sumIteratorLongStream(num);
        sumIteratorLongStreamParallel(num);
    }

    private static void sumFor(long num) {
        long result = 0;
        long init = System.currentTimeMillis();
        for (int i = 1; i <= num; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();

        System.out.println("Sum sumFor: " + result + " : " + (end - init) + " ms");

    }

    private static void sumIteratorStream(long num) {

        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();

        System.out.println("Sum sumIteratorStream: " + result + " : " + (end - init) + " ms");

    }

    private static void sumIteratorStreamParallel(long num) {

        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();

        System.out.println("Sum sumIteratorStreamParallel: " + result + " : " + (end - init) + " ms");

    }

    private static void sumIteratorLongStream(long num) {

        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();

        System.out.println("Sum sumIteratorLongStream: " + result + " : " + (end - init) + " ms");

    }

    private static void sumIteratorLongStreamParallel(long num) {

        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();

        System.out.println("Sum sumIteratorLongStreamParallel: " + result + " : " + (end - init) + " ms");

    }
}
