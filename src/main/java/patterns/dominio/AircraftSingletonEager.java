package patterns.dominio;

import java.util.HashSet;
import java.util.Set;

public final class AircraftSingletonEager {
    private final static AircraftSingletonEager INSTANCE = new AircraftSingletonEager("787-900");
    private final Set<String> availableSeets = new HashSet<>();
    private final String name;

    {
        availableSeets.add("1A");
        availableSeets.add("2B");
    }


    public AircraftSingletonEager(String name) {
        this.name = name;
    }

    public boolean BuySet(String seet) {
        return availableSeets.remove(seet);
    }


    public static AircraftSingletonEager getINSTANCE() {
        return INSTANCE;
    }
}
