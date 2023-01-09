package br.com.maratonajava.string.test;

public class StringBuilderTest1 {
    public static void main(String[] args) {
        String nome = "Yugi";
        nome.concat(" Moto");
        System.out.println(nome);

        StringBuilder stringBuilder = new StringBuilder("Alison Ailson");
        stringBuilder.append(" da Silva").append(" Santos");
        System.out.println(stringBuilder);

        stringBuilder.reverse();
        System.out.println(stringBuilder);

        stringBuilder.delete(0, 3);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
