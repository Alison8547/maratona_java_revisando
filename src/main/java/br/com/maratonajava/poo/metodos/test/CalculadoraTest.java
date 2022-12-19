package br.com.maratonajava.poo.metodos.test;

import br.com.maratonajava.poo.metodos.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        calc.somaDoisNumeros();
        System.out.println("===================");
        calc.subtraiDoisNumeros();
        System.out.println("===================");
        calc.multiplicacao(4, 5); // quando tá aqui é argumentos
        double result = calc.divisao(10,0);
        System.out.println(result);
    }
}
