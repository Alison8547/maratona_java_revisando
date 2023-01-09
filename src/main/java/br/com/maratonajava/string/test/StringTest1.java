package br.com.maratonajava.string.test;

public class StringTest1 {
    public static void main(String[] args) {
        String nome1 = "Alison";
        String nome2 = "Alison";
        nome1 = nome1.concat(" Silva");
        String nome3 = new String("Alison");
        System.out.println(nome1);

        System.out.println(nome1 == nome2);
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
