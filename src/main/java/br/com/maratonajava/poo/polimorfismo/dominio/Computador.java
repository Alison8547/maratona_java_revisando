package br.com.maratonajava.poo.polimorfismo.dominio;

public class Computador extends Produto{
        private static final double TAXA_IMPOSTO = 0.21;

    public Computador(String nome, Double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
       return this.valor * TAXA_IMPOSTO;
    }
}
