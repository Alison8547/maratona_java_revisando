package br.com.maratonajava.poo.polimorfismo.test;

import br.com.maratonajava.poo.polimorfismo.repositorio.Repositorio;
import br.com.maratonajava.poo.polimorfismo.service.RepositorioBancoDeDados;
import br.com.maratonajava.poo.polimorfismo.service.RepositorioMemoria;

public class RepositorioTest1 {
    public static void main(String[] args) {
        Repositorio repositorio1 = new RepositorioBancoDeDados();
        Repositorio repositorio2 = new RepositorioMemoria();
        
        repositorio1.salvar();
        System.out.println("----------");
        repositorio2.salvar();
    }
}
