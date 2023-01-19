package br.com.maratonajava.collections.test;

import br.com.maratonajava.collections.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest1 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1111", "Samsung");
        Smartphone s2 = new Smartphone("2222", "Iphone");
        Smartphone s3 = new Smartphone("3333", "Readmi");
        Smartphone s5 = new Smartphone("t34ss", "LG");

        List<Smartphone> smartphoneList = new ArrayList<>();

        smartphoneList.add(s1);
        smartphoneList.add(s2);
        smartphoneList.add(s3);
        smartphoneList.add(0,s5);

        for (Smartphone smartphone : smartphoneList) {
            System.out.println(smartphone);
        }

        Smartphone s4 = new Smartphone("3333", "Readmi");

        int i = smartphoneList.indexOf(s4);
        System.out.println(i);

        System.out.println(smartphoneList.contains(s4));
        System.out.println(smartphoneList.get(i));
    }
}
