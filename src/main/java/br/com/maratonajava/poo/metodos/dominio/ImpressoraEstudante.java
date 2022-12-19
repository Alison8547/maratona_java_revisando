package br.com.maratonajava.poo.metodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante) {
        System.out.println(estudante.getName());
        System.out.println(estudante.getIdade());
        System.out.println(estudante.getSexo());
    }
}
