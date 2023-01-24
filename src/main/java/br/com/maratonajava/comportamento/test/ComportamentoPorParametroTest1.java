package br.com.maratonajava.comportamento.test;

import br.com.maratonajava.comportamento.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest1 {
    private static List<Car> carList = List.of(new Car("blue", 2011), new Car("yellow", 2020), new Car("black", 1998));

    public static void main(String[] args) {
        System.out.println(filterByColor(carList, "blue"));
        System.out.println(filterByYear(carList, 2012));
    }

    public static List<Car> filterByColor(List<Car> cars, String color) {
        List<Car> carList = new ArrayList<>();

        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                carList.add(car);
            }
        }

        return carList;
    }

    public static List<Car> filterByYear(List<Car> cars, Integer year) {
        List<Car> carList = new ArrayList<>();

        for (Car car : cars) {
            if (car.getYear() < year) {
                carList.add(car);
            }
        }

        return carList;
    }
}
