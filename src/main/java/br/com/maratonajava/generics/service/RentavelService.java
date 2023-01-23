package br.com.maratonajava.generics.service;


import java.util.List;

public class RentavelService<T> {
    private final List<T> objetosDisponiveis;

    public RentavelService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T alugandoObjetoDisponivel() {
        System.out.println("Alugando objeto...");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Objeto alugado: " + t);

        return t;
    }


    public void devolvendoObjetoAlugado(T t) {
        System.out.println("Devolvendo objeto alugado...");
        objetosDisponiveis.add(t);
        System.out.println("Objeto devolvido: " + t);
        System.out.println("Objeto disponivéis: " + objetosDisponiveis.toString());
    }
}
