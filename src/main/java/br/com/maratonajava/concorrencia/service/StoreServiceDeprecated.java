package br.com.maratonajava.concorrencia.service;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class StoreServiceDeprecated {

    public double getPricesSync(String storeName) {
        System.out.printf("Get Prices getPricesSync Store %s%n", storeName);
        return priceGenerator();

    }

    public double priceGenerator() {
        System.out.printf("%s Price Generator %n", Thread.currentThread().getName());
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 3;
    }

    public void delay() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
