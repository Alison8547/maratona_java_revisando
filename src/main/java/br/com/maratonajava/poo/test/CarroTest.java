package br.com.maratonajava.poo.test;

import br.com.maratonajava.poo.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro("GTR", "Nissan", 2012);
        Carro carro2 = new Carro("SF90", "Ferrari", 2017);

        System.out.println(carro1);
        System.out.println(carro2);
    }
}
