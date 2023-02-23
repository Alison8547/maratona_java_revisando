package br.com.maratonajava.concorrencia.service;

import br.com.maratonajava.concorrencia.dominio.Discount;
import br.com.maratonajava.concorrencia.dominio.Quote;

import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class StoreServiceWithDiscount {

    public String getPricesSync(String storeName) {
        double price = priceGenerator();
        Discount.Code discount = Discount.Code.values()[ThreadLocalRandom.current().nextInt(Discount.Code.values().length)];
        return String.format(Locale.US,"%s : %.2f : %s%n", storeName, price, discount);

    }

    public String applyDiscount(Quote quote) {
        delay();
        double discount = quote.getPrice() * (100 - quote.getCode().getDiscount()) / 100;

        return String.format(Locale.US,"%s original preço: %.2f Desconto aplicado %s e Preço final %.2f%n",
                quote.getStore(), quote.getPrice(), quote.getCode(), discount);
    }

    public double priceGenerator() {
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 3;
    }

    public void delay() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
