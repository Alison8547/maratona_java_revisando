package br.com.maratonajava.poo.associacao.test;

import br.com.maratonajava.poo.associacao.dominio.Jogador;
import br.com.maratonajava.poo.associacao.dominio.Time;

public class JogadorTest2 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Messi");
        Time time = new Time("Barcelona");
        jogador.setTime(time);

        jogador.imprime();
    }
}
