package br.com.maratonajava.comportamento.domain;

public class Car {
    private final String name = "GTR";
    private String color;
    private Integer year;

    public Car(String color, Integer year) {
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Integer getYear() {
        return year;
    }
}
