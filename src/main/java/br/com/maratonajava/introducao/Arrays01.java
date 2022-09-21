package br.com.maratonajava.introducao;

import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] idades = new int[3];
        idades[0] = 24;
        idades[1] = 14;
        idades[2] = 18;

        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);


        String[] nomes = new String[4];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o nome:");
            nomes[i] = scanner.nextLine();
        }

        for (String list : nomes) {
            System.out.println(list);
        }

        int[] numeros = {1, 2, 3, 4, 5};
        int[] numeros2 = new int[]{10, 15, 20, 25, 30}; // Dá no mesmo essas duas formas de iniciar

        for (int num : numeros) {
            System.out.println(num);
        }

    }
}
