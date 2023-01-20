package br.com.maratonajava.collections.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Caza", "Casa");
        map.put("Avore", "Árvore");
        map.putIfAbsent("Avore", "Árvore"); // vai verificar antes se existe e não vai deixar dá um insert.
        map.put("Cachoro", "Cachorro");
        map.put("Macarao", "Macarrão");
        map.put("Macarao2", "Macarrão");

        System.out.println(map);

        System.out.println("----------");

        for (String key : map.keySet()) {
            System.out.println(key + " - " + map.get(key));
        }

        System.out.println("------------");

        for (String value : map.values()) {
            System.out.println(value);
        }

        System.out.println("------------");

        for (Map.Entry<String, String> mapEntry : map.entrySet()) {
            System.out.println(mapEntry.getKey() + " - " + mapEntry.getValue());
        }
    }
}
