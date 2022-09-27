package br.com.maratonajava.poo.test;

import br.com.maratonajava.poo.domain.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante("Alison", 18, 'M');
        Estudante estudante2 = new Estudante("Juliana", 22, 'F');

        System.out.println(estudante1);
        System.out.println(estudante2);
    }
}
