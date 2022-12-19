package br.com.maratonajava.poo.associacao.test;

import br.com.maratonajava.poo.associacao.dominio.Jogador;

public class JogadorTest {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Messi");
        Jogador jogador2 = new Jogador("Neymar");
        Jogador jogador3 = new Jogador("Mbappe");

        Jogador[] jogadors = new Jogador[]{jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadors) {
            jogador.imprime();
        }

    }
}
