package br.com.maratonajava.poo.metodos.test;

import br.com.maratonajava.poo.metodos.dominio.Estudante;
import br.com.maratonajava.poo.metodos.dominio.ImpressoraEstudante;

public class EstudanteTest2 {
    public static void main(String[] args) {
        ImpressoraEstudante impressora = new ImpressoraEstudante();
        Estudante estudante1 = new Estudante("Alison",24,'M');
        Estudante estudante2 = new Estudante("Brena",20,'F');

        impressora.imprime(estudante1);  // Então aqui é diferente pq estou fazendo refêrencia ao objeto
        System.out.println();
        impressora.imprime(estudante2);



    }
}
