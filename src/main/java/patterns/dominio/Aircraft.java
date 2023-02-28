package patterns.dominio;

import java.util.HashSet;
import java.util.Set;

public class Aircraft {
    private final Set<String> availableSeets = new HashSet<>();
    private final String name;

    {
        availableSeets.add("1A");
        availableSeets.add("2B");
    }


    public Aircraft(String name) {
        this.name = name;
    }

    public boolean BuySet(String seet) {
        return availableSeets.remove(seet);
    }
}
