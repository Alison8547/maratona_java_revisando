package br.com.maratonajava.introducao;

import java.util.Scanner;

public class Aula21EstruturasCondicionais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();
        String categoria;

        if (idade < 15) {
            categoria = "Infantil";
        } else if (idade < 18) {
            categoria = "Juvenil";
        } else {
            categoria = "Adulto";
        }
        System.out.println(categoria);

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Digite seu salario:");
        double salario = scanner1.nextDouble();

        String resultado = salario > 5000.0d ? "Eu posso doar" : "Eu não posso doar ainda, mas no futuro terei condições";
        System.out.println(resultado);
    }
}
