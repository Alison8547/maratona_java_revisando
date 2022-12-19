package br.com.maratonajava.poo.metodos.test;

import br.com.maratonajava.poo.metodos.dominio.Funcionario;

import java.util.Arrays;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Alison", 22, new double[]{800.00, 2600.00, 3200.00});
//        funcionario.imprimir();
//        funcionario.mediaSalario();

        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getIdade());
        System.out.println(Arrays.toString(funcionario.getSalarios()));
    }
}
