package br.com.maratonajava.poo.associacao.test;

import br.com.maratonajava.poo.associacao.dominio.Jogador;
import br.com.maratonajava.poo.associacao.dominio.Time;

public class JogadorTest3 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Messi");
        Jogador jogador2 = new Jogador("Neymar");
        Jogador jogador3 = new Jogador("Suárez");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        Time time = new Time("Barcelona");
        time.setJogadores(jogadores);
        jogador1.setTime(time);
        jogador2.setTime(time);
        jogador3.setTime(time);

        System.out.println("--- Jogador ---");
        jogador1.imprime();
        jogador2.imprime();
        jogador3.imprime();
        System.out.println("--- Time ---");
        time.imprime();

    }
}
