package br.com.maratonajava.comportamento.test;

import br.com.maratonajava.comportamento.domain.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest3 {
    private static List<Car> carList = List.of(new Car("blue", 2011), new Car("yellow", 2020), new Car("black", 1998));

    public static void main(String[] args) {
        System.out.println(filter(carList, car -> car.getColor().equals("blue")));
        System.out.println(filter(carList, car -> car.getColor().equals("yellow")));
        System.out.println(filter(carList, car -> car.getYear() < 2015));

        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(filter(integerList, x -> x % 2 == 0));
        System.out.println(filter(integerList, x -> x % 2 != 0));
        System.out.println(filter(integerList, x -> x < 8));
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> arrayList = new ArrayList<>();

        for (T t : list) {
            if (predicate.test(t)) {
                arrayList.add(t);
            }
        }

        return arrayList;
    }


}
