package br.com.maratonajava.poo.metodos.test;

import br.com.maratonajava.poo.metodos.dominio.Calculadora;

public class CalculadoraTest3 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int a = 12;
        int b = 18;

        calculadora.alteraDoisNumeros(a, b);
        System.out.println();
        // Quer dizer que eu tô basicamente fazendo uma cópia do tipo primitivo, mas o valor sempre vai tá lá o mesmo
        System.out.printf("Número 1: %d%nNúmero 2: %d%n", a, b);
    }
}
