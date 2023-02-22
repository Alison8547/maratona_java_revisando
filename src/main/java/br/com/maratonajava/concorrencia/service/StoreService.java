package br.com.maratonajava.concorrencia.service;

import java.util.concurrent.*;

public class StoreService {

    private static ExecutorService ex = Executors.newCachedThreadPool();


    public double getPricesSync(String storeName) {
        System.out.printf("Get Prices getPricesSync Store %s%n", storeName);
        return priceGenerator();

    }

    public Future<Double> getPricesAsyncFuture(String storeName) {
        System.out.printf("Get Prices getPricesAsyncFuture Store %s%n", storeName);

        return ex.submit(this::priceGenerator);

    }
    public CompletableFuture<Double> getPricesAsyncCompletableFuture(String storeName) {
        System.out.printf("Get Prices getPricesAsyncCompletableFuture Store %s%n", storeName);

        return CompletableFuture.supplyAsync(this::priceGenerator);

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

    public static void shutdown() {
        ex.shutdown();
    }
}
