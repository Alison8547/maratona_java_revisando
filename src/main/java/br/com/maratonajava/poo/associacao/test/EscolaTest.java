package br.com.maratonajava.poo.associacao.test;

import br.com.maratonajava.poo.associacao.dominio.Escola;
import br.com.maratonajava.poo.associacao.dominio.Professor;

public class EscolaTest {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya Sensei");
        Professor professor2 = new Professor("Kakashi Sensei");

        Professor[] professors = {professor1, professor2};

        Escola escola = new Escola("Konoha", professors);

        escola.imprime();
    }
}
