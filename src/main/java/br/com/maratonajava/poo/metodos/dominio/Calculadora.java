package br.com.maratonajava.poo.metodos.dominio;

import java.util.Scanner;

public class Calculadora {
    private static final Scanner scanner = new Scanner(System.in);

    public void somaDoisNumeros() {
        System.out.println("Digite o primeiro número:");
        int number1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int number2 = scanner.nextInt();

        int result = number1 + number2;

        System.out.printf("Resultado da soma: %d%n", result);
    }

    public void subtraiDoisNumeros() {
        System.out.println("Digite o primeiro número:");
        int number1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int number2 = scanner.nextInt();

        int result = number1 - number2;

        System.out.printf("Resultado da subtração: %d%n", result);
    }

    public void multiplicacao(int num1, int num2) {  // parametros
        System.out.printf("%d X %d = %d%n", num1, num2, (num1 * num2));
    }

    public double divisao(double num1, double num2) {
        if (num2 == 0) return 0;
        return num1 / num2;
    }

    public double divisao02(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }

        return 0;
    }

    public void divisao03(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Divisão não pode ser dividida por zero!");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void alteraDoisNumeros(int numero1, int numero2) {
        numero1 = 205;
        numero2 = 88;
        System.out.printf("Número 1: %d%nNúmero 2: %d%n", numero1, numero2);
    }

    public void somaArray(int[] arrays) {
        int soma = 0;
        for (int i = 0; i < arrays.length; i++) {
            soma += arrays[i];
        }
        System.out.println(soma);
    }

    public void varArgs(int... num) { // varArgs é mesma coisa q um array. Só foi feito pra deixar as coisas mais simples
        int soma = 0;
        for (int list : num) {
            soma += list;
        }
        System.out.println(soma);
    }
}
