package br.com.maratonajava.poo.polimorfismo.service;

import br.com.maratonajava.poo.polimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados...");
    }
}
