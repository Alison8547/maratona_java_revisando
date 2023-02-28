package patterns.test;

import patterns.dominio.AircraftSingletonEager;

public class AircraftSingletonEagerTest2 {
    public static void main(String[] args) {
        bookSeet("1A");
        bookSeet("1A");
    }

    public static void bookSeet(String seet) {
        AircraftSingletonEager aircraftSingletonEager = AircraftSingletonEager.getINSTANCE();
        System.out.println(aircraftSingletonEager);
        System.out.println(aircraftSingletonEager.BuySet(seet));
    }
}
