package br.com.maratonajava.optional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest1 {
    public static void main(String[] args) {
        Optional<String> nameOptional = findName("Alison");
        System.out.println(nameOptional);
        String empty = nameOptional.orElse("EMPTY");
        System.out.println(empty);

        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));
    }

    private static Optional<String> findName(String name) {
        List<String> list = List.of("Alison", "Luiz", "Maicon");

        int i = list.indexOf(name);

        if (i != -1) {
            return Optional.of(list.get(i));
        }

        return Optional.empty();
    }
}
