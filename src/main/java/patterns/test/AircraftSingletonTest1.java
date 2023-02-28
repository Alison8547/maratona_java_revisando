package patterns.test;

import patterns.dominio.Aircraft;

public class AircraftSingletonTest1 {
    public static void main(String[] args) {
        bookSeet("1A");
        bookSeet("1A");
    }

    public static void bookSeet(String seet) {
        Aircraft aircraft = new Aircraft("787-900");
        System.out.println(aircraft.BuySet(seet));
    }
}
