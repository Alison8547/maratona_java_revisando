package br.com.maratonajava.poo.classesabstratas.test;

import br.com.maratonajava.poo.classesabstratas.dominio.Desenvolvedor;
import br.com.maratonajava.poo.classesabstratas.dominio.Gerente;

public class FuncionarioTest1 {
    public static void main(String[] args) {
        Desenvolvedor desenvolvedor = new Desenvolvedor("Alison", 4000.0);
        Gerente gerente = new Gerente("Maicon", 7000.0);

        System.out.println(desenvolvedor);
        System.out.println(gerente);
        desenvolvedor.imprimi();
        gerente.imprimi();
    }
}
