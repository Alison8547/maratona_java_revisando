package br.com.maratonajava.collections.test;

import br.com.maratonajava.collections.domain.Smartphone;

public class EqualsTest1 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1SXD", "iPhone");
        Smartphone s2 = new Smartphone("1SXD", "iPhone");

        System.out.println(s1.equals(s2));
    }
}
