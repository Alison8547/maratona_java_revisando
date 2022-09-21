package br.com.maratonajava.introducao;

import java.util.Scanner;

public class EstruturasRepeticao {
    public static void main(String[] args) {
        // while, do while, for
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de números que vc quer repetir:");
        int x = scanner.nextInt();
        int counter = 0;
        while (counter < x) {
            System.out.printf("%d ", counter);
            counter++;
        }
        System.out.println();
        counter = 2;
        do {
            System.out.printf("Dentro do while: %d ", counter++);  // vai executar pelo menos uma vez, mesmo a condição sendo falsa
        } while (counter < 3);

        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.printf("%d ", i);
        }

        for (int i = 0; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d ", i);
            }
        }

        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if (i > 25) break;
            System.out.printf("%d ", i);

        }
        System.out.println();
        exercicio();
    }

    public static void exercicio() {
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) break;
            System.out.printf("Parcela: %d Valor da parcela: %.2f%n",parcela,valorParcela);

        }
    }
}
