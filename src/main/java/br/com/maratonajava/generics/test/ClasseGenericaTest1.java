package br.com.maratonajava.generics.test;

import br.com.maratonajava.generics.dominio.Carro;
import br.com.maratonajava.generics.service.CarroRentavelService;

public class ClasseGenericaTest1 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.alugandoCarroDisponivel();
        carroRentavelService.devolvendoCarroAlugado(carro);
    }
}
