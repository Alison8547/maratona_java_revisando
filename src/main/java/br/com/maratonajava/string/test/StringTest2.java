package br.com.maratonajava.string.test;

public class StringTest2 {
    public static void main(String[] args) {
        String nome = "  Kuroro";
        String numeros = "012345";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace('r', 'l'));
        System.out.println(numeros.length());
        System.out.println(numeros.substring(0, 3));
        System.out.println(numeros.substring(3, numeros.length()));
        System.out.println(nome.trim());
    }
}
