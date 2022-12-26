package br.com.maratonajava.poo.heranca.test;

import br.com.maratonajava.poo.heranca.dominio.Endereco;
import br.com.maratonajava.poo.heranca.dominio.Funcionario;
import br.com.maratonajava.poo.heranca.dominio.Pessoa;

public class HerancaTest1 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setCep("84944-224");
        endereco.setRua("Rua da liberdade");

        Endereco endereco2 = new Endereco();
        endereco2.setCep("14445-224");
        endereco2.setRua("Rua da prata");

        Pessoa pessoa = new Pessoa("Alison");
        pessoa.setCpf("111-111-111-11");
        pessoa.setEndereco(endereco);

        pessoa.imprimir();

        Funcionario funcionario = new Funcionario("Tiago");
        funcionario.setCpf("222-223-444-55");
        funcionario.setSalario(1500.0d);
        funcionario.setEndereco(endereco2);

        System.out.println("--------");
        funcionario.imprimir();
        funcionario.relatorio();
    }
}
