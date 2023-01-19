package br.com.maratonajava.collections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest1 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(6);
        numeros.add(3);
        numeros.add(8);

        Collections.sort(numeros);

        System.out.println(numeros);

        System.out.println(Collections.binarySearch(numeros, 2));
        System.out.println(Collections.binarySearch(numeros, 1));
    }
}
