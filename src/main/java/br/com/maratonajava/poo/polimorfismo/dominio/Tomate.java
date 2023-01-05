package br.com.maratonajava.poo.polimorfismo.dominio;

public class Tomate extends Produto{

    private String dataValidade;
    private static final double TAXA_IMPOSTO = 0.6;

    public Tomate(String nome, Double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        return this.valor * TAXA_IMPOSTO;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
