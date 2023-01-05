package br.com.maratonajava.poo.polimorfismo.service;

import br.com.maratonajava.poo.polimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em arquivo...");
    }
}
