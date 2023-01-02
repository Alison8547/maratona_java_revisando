package br.com.maratonajava.poo.metodos.test;

import br.com.maratonajava.poo.metodos.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Chris");
        pessoa.setIdade(18);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
