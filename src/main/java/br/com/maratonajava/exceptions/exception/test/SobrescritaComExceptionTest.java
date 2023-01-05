package br.com.maratonajava.exceptions.exception.test;

import br.com.maratonajava.exceptions.exception.dominio.Funcionario;
import br.com.maratonajava.exceptions.exception.dominio.LoginInvalidoException;
import br.com.maratonajava.exceptions.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Pessoa pessoa = new Pessoa();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }

        try {
            pessoa.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
