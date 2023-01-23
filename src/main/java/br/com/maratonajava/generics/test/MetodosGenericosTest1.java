package br.com.maratonajava.generics.test;

import br.com.maratonajava.generics.dominio.Carro;

import java.util.List;

public class MetodosGenericosTest1 {
    public static void main(String[] args) {
        System.out.println(objetoByList(new Carro("Maclaren")));
        System.out.println(listGenerics(List.of(new Carro("GTR"), new Carro("Gol"), new Carro("Lamborghini"))));
    }

    private static <T> List<T> objetoByList(T t) {
        return List.of(t);
    }


    private static <T> List<T> listGenerics(List<T> t) {
        return t;
    }
}
