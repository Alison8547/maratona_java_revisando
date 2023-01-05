package br.com.maratonajava.exceptions.exception.dominio;

public class Funcionario extends Pessoa {
    @Override
    public void salvar() throws LoginInvalidoException {
        System.out.println("Salvando funcionario");
    }
}
