package br.com.maratonajava.generics.test;

import br.com.maratonajava.generics.dominio.Barco;
import br.com.maratonajava.generics.service.BarcoRentavelService;

public class ClasseGenericaTest2 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.alugandoBarcoDisponivel();
        barcoRentavelService.devolvendoBarcoAlugado(barco);
    }
}
