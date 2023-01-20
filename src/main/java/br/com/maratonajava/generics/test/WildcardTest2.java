package br.com.maratonajava.generics.test;


import java.util.ArrayList;
import java.util.List;

public class WildcardTest2 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        printConsulta(cachorros);
        printConsulta(gatos);

        List<Animal> animals = new ArrayList<>();

        printConsultaAnimal(animals);

    }

    public static void printConsulta(List<? extends Animal> animals) { // extends também é pra interface implements
        for (Animal animal : animals) {
            animal.consulta();
        }
    }


    public static void printConsultaAnimal(List<? super Animal> animals) { // agora eu posso adicionar
        animals.add(new Cachorro());
        animals.add(new Gato());
    }
}
