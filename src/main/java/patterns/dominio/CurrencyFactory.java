package patterns.dominio;

public class CurrencyFactory {
    public static Currency newCurrency(Country country) {
        switch (country) {
            case USA -> {
                return new Dollar();
            }
            case BRAZIL -> {
                return new Real();
            }
            default -> {
                throw new IllegalArgumentException("Argumento inválido!");
            }
        }


    }

}
