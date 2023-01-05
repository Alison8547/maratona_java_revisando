package br.com.maratonajava.poo.polimorfismo.test;

import br.com.maratonajava.poo.polimorfismo.dominio.Computador;
import br.com.maratonajava.poo.polimorfismo.dominio.Produto;
import br.com.maratonajava.poo.polimorfismo.dominio.Tomate;
import br.com.maratonajava.poo.polimorfismo.service.CalculadoraImposto;

public class ProdutoTest1 {
    public static void main(String[] args) {
        Produto computador = new Computador("Ryzen 5 5600", 1200.0);

        Produto tomate = new Tomate("Tomante branco", 10.0);

        CalculadoraImposto.calculaImposto(computador);
        System.out.println("--------------");
        CalculadoraImposto.calculaImposto(tomate);


    }
}
