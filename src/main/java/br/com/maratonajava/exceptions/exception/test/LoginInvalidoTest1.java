package br.com.maratonajava.exceptions.exception.test;

import br.com.maratonajava.exceptions.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoTest1 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner scanner = new Scanner(System.in);
        String username = "Alison";
        String password = "1234";

        System.out.println("Digite seu login:");
        String loginDigitado = scanner.nextLine();

        System.out.println("Digite sua senha:");
        String senhaDigitada = scanner.nextLine();

        if (!loginDigitado.equals(username) || !senhaDigitada.equals(password)) {
            throw new LoginInvalidoException("Login ou senha inválido!");
        }

        System.out.println("Você logou com sucesso!");
    }
}
