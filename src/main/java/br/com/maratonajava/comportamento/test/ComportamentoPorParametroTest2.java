package br.com.maratonajava.comportamento.test;

import br.com.maratonajava.comportamento.domain.Car;
import br.com.maratonajava.comportamento.domain.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest2 {
    private static List<Car> carList = List.of(new Car("blue", 2011), new Car("yellow", 2020), new Car("black", 1998));

    public static void main(String[] args) {
        System.out.println(filter(carList, car -> car.getColor().equals("blue")));
        System.out.println(filter(carList, car -> car.getColor().equals("yellow")));
        System.out.println(filter(carList, car -> car.getYear() < 2015));
    }

    public static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
        List<Car> carList = new ArrayList<>();

        for (Car car : cars) {
            if (carPredicate.test(car)) {
                carList.add(car);
            }
        }
        return carList;
    }


}
