package br.com.maratonajava.poo.modificadorfinal.test;

import br.com.maratonajava.poo.modificadorfinal.dominio.Carro;
import br.com.maratonajava.poo.modificadorfinal.dominio.Ferrari;

public class CarroTest1 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_MAXIMA);

        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Jiraya");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();
    }
}
