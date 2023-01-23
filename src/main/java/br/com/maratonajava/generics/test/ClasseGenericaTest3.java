package br.com.maratonajava.generics.test;

import br.com.maratonajava.generics.dominio.Barco;
import br.com.maratonajava.generics.dominio.Carro;
import br.com.maratonajava.generics.service.RentavelService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest3 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("GTR")));
        List<Barco> barcoDisponiveis = new ArrayList<>(List.of(new Barco("Canoa"), new Barco("Submarino")));

        RentavelService<Carro> carroRentavelService = new RentavelService<>(carrosDisponiveis);
        Carro carro = carroRentavelService.alugandoObjetoDisponivel();
        carroRentavelService.devolvendoObjetoAlugado(carro);

        System.out.println("--------------");

        RentavelService<Barco> barcoRentavelService = new RentavelService<>(barcoDisponiveis);
        Barco barco = barcoRentavelService.alugandoObjetoDisponivel();
        barcoRentavelService.devolvendoObjetoAlugado(barco);
    }
}
