package br.com.maratonajava.poo.polimorfismo.service;

import br.com.maratonajava.poo.polimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memória...");
    }
}
