package br.com.maratonajava.poo.polimorfismo.service;

import br.com.maratonajava.poo.polimorfismo.dominio.Produto;
import br.com.maratonajava.poo.polimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calculaImposto(Produto produto) {
        double imposto = produto.calcularImposto();
        System.out.println("****** Relatorio de imposto ******");
        System.out.printf("Nome: %s%n", produto.getNome());
        System.out.printf("Valor do produto: %.2f%n", produto.getValor());
        System.out.printf("Imposto do produto: %.2f%n", imposto);

        if (produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.printf("Data validade: %s%n", tomate.getDataValidade());
        }
    }
}
