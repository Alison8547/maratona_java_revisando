package br.com.maratonajava.poo.modificadorstatic.test;

import br.com.maratonajava.poo.modificadorstatic.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(100);
        Carro carro1 = new Carro("GTR",250);
        Carro carro2 = new Carro("Ferrari",350);
        Carro carro3 = new Carro("Gol",150);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
