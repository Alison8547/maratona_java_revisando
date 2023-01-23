package br.com.maratonajava.classesinternas.test;

import br.com.maratonajava.generics.dominio.Barco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassTest2 {
    public static void main(String[] args) {
        List<Barco> barcoList = new ArrayList<>(List.of(new Barco("Titanic"), new Barco("Canoa"), new Barco("Jetskin")));

        // com lambda:  barcoList.sort((x, y) -> x.getNome().compareTo(y.getNome()));

        barcoList.sort(new Comparator<Barco>() {

            @Override
            public int compare(Barco o1, Barco o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });

        System.out.println(barcoList);
    }
}
