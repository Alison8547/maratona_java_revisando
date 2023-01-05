package br.com.maratonajava.exceptions.exception.dominio;

public class LoginInvalidoException extends Exception {
    public LoginInvalidoException() {
        System.out.println("Senha inválida!");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
