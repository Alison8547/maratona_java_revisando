package patterns.test;

import patterns.dominio.Country;
import patterns.dominio.Currency;
import patterns.dominio.CurrencyFactory;

public class CurrencyFactoryTest1 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}
