package br.com.maratonajava.generics.service;


import br.com.maratonajava.generics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("GTR"), new Carro("Maclaren")));

    public Carro alugandoCarroDisponivel() {
        System.out.println("Alugando carro...");
        Carro carro = carrosDisponiveis.remove(0);
        System.out.println("Carro alugado: " + carro);

        return carro;
    }


    public void devolvendoCarroAlugado(Carro carro) {
        System.out.println("Devolvendo carro alugado...");
        carrosDisponiveis.add(carro);
        System.out.println("Carro devolvido: " + carro);
        System.out.println("Carros disponivéis: " + carrosDisponiveis.toString());
    }
}
