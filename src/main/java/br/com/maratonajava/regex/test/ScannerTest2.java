package br.com.maratonajava.regex.test;

import java.util.Scanner;

public class ScannerTest2 {
    public static void main(String[] args) {
        String texto = "Chris,Leona,Iori,200,true";
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(",");

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println("Int: " + i);

            } else if (scanner.hasNextBoolean()) {
                boolean b = scanner.nextBoolean();
                System.out.println("Boolean: " + b);

            } else {
                System.out.println(scanner.next());
            }

        }


    }
}
