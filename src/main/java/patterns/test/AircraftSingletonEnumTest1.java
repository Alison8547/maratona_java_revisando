package patterns.test;

import patterns.dominio.AircraftSingletonEnum;

public class AircraftSingletonEnumTest1 {
    public static void main(String[] args) {
        bookSeet("1A");
        bookSeet("1A");

    }

    public static void bookSeet(String seet) {
        System.out.println(AircraftSingletonEnum.INSTANCE.hashCode());
        AircraftSingletonEnum aircraftSingletonEnum = AircraftSingletonEnum.INSTANCE;
        System.out.println(aircraftSingletonEnum.BuySet(seet));
    }
}
