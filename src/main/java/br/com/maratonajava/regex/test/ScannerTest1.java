package br.com.maratonajava.regex.test;

public class ScannerTest1 {
    public static void main(String[] args) {
        String texto = "Chris, Leona, Iori, Angel";
        String[] split = texto.split(",");

        for (String list : split) {
            System.out.println(list.trim());
        }


    }
}
