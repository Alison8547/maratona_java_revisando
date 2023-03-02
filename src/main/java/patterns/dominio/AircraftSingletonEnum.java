package patterns.dominio;

import java.util.HashSet;
import java.util.Set;

public enum AircraftSingletonEnum {
    INSTANCE;
    private final Set<String> availableSeets;

    AircraftSingletonEnum() {
        this.availableSeets = new HashSet<>();
        this.availableSeets.add("1A");
        this.availableSeets.add("1B");
    }

    public boolean BuySet(String seet) {
        return availableSeets.remove(seet);
    }

}
