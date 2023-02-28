package patterns.dominio;

import java.util.HashSet;
import java.util.Set;

public final class AircraftSingletonLazy {
    private static AircraftSingletonLazy INSTANCE;
    private final Set<String> availableSeets = new HashSet<>();
    private final String name;

    {
        availableSeets.add("1A");
        availableSeets.add("2B");
    }


    public AircraftSingletonLazy(String name) {
        this.name = name;
    }

    public boolean BuySet(String seet) {
        return availableSeets.remove(seet);
    }


    public static AircraftSingletonLazy getINSTANCE() {
        if (INSTANCE == null) {
            synchronized (AircraftSingletonLazy.class) {
                if (INSTANCE == null) {
                    INSTANCE = new AircraftSingletonLazy("787-900");
                }
            }
        }
        return INSTANCE;
    }
}
