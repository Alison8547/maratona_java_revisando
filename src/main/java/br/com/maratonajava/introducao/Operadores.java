package br.com.maratonajava.introducao;

import java.util.Scanner;

public class Operadores {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // + - / *
        int numero1 = 40;
        int numero2 = 50;
        int result = numero1 + numero2;

        System.out.println(result);

        // %
        double resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteQueVinte = 10 != 20;

        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezDiferenteQueVinte);

        // && || !

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();
        System.out.println("Digite seu salário:");
        double salario = scanner.nextDouble();

        if (idade > 35 && salario >= 4500.0) {
            System.out.println("Você tem o beneficio!");
        } else {
            System.out.println("Você nao tem o beneficio!");
        }

        System.out.println("Digite o saldo da sua conta poupança:");
        double saldoPoupanca = scanner.nextDouble();
        System.out.println("Digite o saldo da sua conta corrente:");
        double saldoContaCorrente = scanner.nextDouble();
        System.out.println("Digite o valor atual do Playstation 5:");
        double valorPlaystation = scanner.nextDouble();

        if (saldoPoupanca >= valorPlaystation || saldoContaCorrente >= valorPlaystation) {
            System.out.println("Você tem dinheiro suficiente!");
        } else {
            System.out.println("Você nao tem dinheiro suficiente para comprar!");
        }

        // += -= *= /= %=

        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);


        // ++ --

        int incremento = 0;
        incremento++;
        incremento--;
        System.out.println(incremento);

        int incremento2 = 0;
        System.out.println(incremento2++); // colocando assim atrás ele primeiro vai fazer oq tem q fazer q no caso é imprimir pra dps incrementar
        System.out.println(++incremento2); // antes ela já incrementa e imprime
    }
}
