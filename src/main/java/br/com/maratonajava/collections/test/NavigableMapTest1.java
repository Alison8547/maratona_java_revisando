package br.com.maratonajava.collections.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest1 {
    public static void main(String[] args) {
        NavigableMap<String, String> navigableMap = new TreeMap<>();
        navigableMap.put("C", "Letra C");
        navigableMap.put("A", "Letra A");
        navigableMap.put("B", "Letra B");
        navigableMap.put("E", "Letra E");

        for (Map.Entry<String, String> entry : navigableMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println(navigableMap.headMap("C", true)); // Retorna as key antes dessa

        // lower <
        // flower <=
        // higher >
        // ceiling >=

        System.out.println(navigableMap.lowerKey("C"));
        System.out.println(navigableMap.floorKey("C"));
        System.out.println(navigableMap.higherKey("C"));
        System.out.println(navigableMap.ceilingKey("C"));
        System.out.println(navigableMap.higherEntry("C"));


    }
}
