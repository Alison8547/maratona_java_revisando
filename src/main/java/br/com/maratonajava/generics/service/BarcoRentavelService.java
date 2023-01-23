package br.com.maratonajava.generics.service;


import br.com.maratonajava.generics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Canoa"), new Barco("Iate")));

    public Barco alugandoBarcoDisponivel() {
        System.out.println("Alugando barco...");
        Barco carro = barcosDisponiveis.remove(0);
        System.out.println("Barco alugado: " + carro);

        return carro;
    }


    public void devolvendoBarcoAlugado(Barco barco) {
        System.out.println("Devolvendo barco alugado...");
        barcosDisponiveis.add(barco);
        System.out.println("Barco devolvido: " + barco);
        System.out.println("Barcos disponivéis: " + barcosDisponiveis.toString());
    }
}
