package br.com.maratonajava.concorrencia.test;

import br.com.maratonajava.concorrencia.service.StoreServiceDeprecated;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureTest3 {
    public static void main(String[] args) {
        StoreServiceDeprecated storeService = new StoreServiceDeprecated();
        searchPricesAsyncCompletableFuture(storeService);

    }

    private static void searchPricesAsyncCompletableFuture(StoreServiceDeprecated storeService) {
        long start = System.currentTimeMillis();
        ExecutorService ex = Executors.newFixedThreadPool(4, r -> {
            Thread thread = new Thread(r);
            thread.setDaemon(true);
            return thread;
        });
        List<String> list = List.of("Store 1", "Store 2", "Store 3", "Store 4");

        List<CompletableFuture<Double>> completableFutures = list.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> storeService.getPricesSync(s), ex))
                .toList();

        List<Double> prices = completableFutures.stream()
                .map(CompletableFuture::join)
                .toList();

        System.out.println(prices);

        long end = System.currentTimeMillis();
        ex.shutdown();

        System.out.printf("Time searchPricesSync %d%n", (end - start));
    }
}
