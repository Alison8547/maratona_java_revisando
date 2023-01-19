package br.com.maratonajava.collections.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversao {
    public static void main(String[] args) {
        List<Integer> integerList1 = new ArrayList<>();
        integerList1.add(1);
        integerList1.add(2);
        integerList1.add(3);
        integerList1.add(4);

        System.out.println(integerList1);

        Integer[] integersArrays = integerList1.toArray(new Integer[0]);

        System.out.println(Arrays.toString(integersArrays));
        System.out.println("---------");

        Integer[] integersArrays2 = new Integer[4];
        integersArrays2[0] = 1;
        integersArrays2[1] = 2;
        integersArrays2[2] = 3;
        integersArrays2[3] = 4;

        List<Integer> integerList2 = Arrays.asList(integersArrays2);
        integerList2.set(0, 23);

        System.out.println(integerList2);
        System.out.println(Arrays.toString(integersArrays2));


    }
}
