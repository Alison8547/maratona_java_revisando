package br.com.maratonajava.poo.metodos.test;

import br.com.maratonajava.poo.metodos.dominio.Calculadora;

public class CalculadoraTest2 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        double result = calc.divisao02(6,0);
        System.out.println(result);

        calc.divisao03(12,0);
    }
}
