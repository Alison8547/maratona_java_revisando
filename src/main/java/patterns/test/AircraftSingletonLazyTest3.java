package patterns.test;

import patterns.dominio.AircraftSingletonLazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AircraftSingletonLazyTest3 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        bookSeet("1A");
        bookSeet("1A");
        System.out.println(AircraftSingletonLazy.getINSTANCE());
        System.out.println(AircraftSingletonLazy.getINSTANCE());
        Constructor<AircraftSingletonLazy> declaredConstructor = AircraftSingletonLazy.class.getDeclaredConstructor(String.class);
        declaredConstructor.setAccessible(true);
        declaredConstructor.newInstance("787-900");
        System.out.println(declaredConstructor);

    }

    public static void bookSeet(String seet) {
        AircraftSingletonLazy aircraftSingletonLazy = AircraftSingletonLazy.getINSTANCE();
        System.out.println(aircraftSingletonLazy);
        System.out.println(aircraftSingletonLazy.BuySet(seet));
    }
}
