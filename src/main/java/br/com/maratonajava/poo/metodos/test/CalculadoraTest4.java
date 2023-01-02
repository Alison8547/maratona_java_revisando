package br.com.maratonajava.poo.metodos.test;

import br.com.maratonajava.poo.metodos.dominio.Calculadora;

public class CalculadoraTest4 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] x = {1, 2, 3, 4, 5, 6};
        calculadora.somaArray(x);
      //  calculadora.varArgs(x);
        calculadora.varArgs(1,2,3,4,5,6); // posso passar assim o varArgs
    }
}
