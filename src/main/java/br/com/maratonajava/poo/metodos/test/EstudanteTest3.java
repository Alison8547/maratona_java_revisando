package br.com.maratonajava.poo.metodos.test;

import br.com.maratonajava.poo.metodos.dominio.Estudante;

public class EstudanteTest3 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante("Alison", 24, 'M');
        Estudante estudante2 = new Estudante("Diego", 30, 'M');

        estudante1.imprime();
        System.out.println("-----------");
        estudante2.imprime();

    }
}
