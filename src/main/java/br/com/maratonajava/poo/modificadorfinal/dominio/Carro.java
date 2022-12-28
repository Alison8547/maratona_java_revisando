package br.com.maratonajava.poo.modificadorfinal.dominio;

import br.com.maratonajava.poo.modificadorfinal.Comprador;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_MAXIMA = 250;
    public final Comprador COMPRADOR = new Comprador();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
