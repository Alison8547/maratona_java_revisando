package br.com.maratonajava.concorrencia.test;

import br.com.maratonajava.concorrencia.dominio.Quote;
import br.com.maratonajava.concorrencia.service.StoreServiceWithDiscount;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureTest5 {
    public static void main(String[] args) {
        StoreServiceWithDiscount storeService = new StoreServiceWithDiscount();
        searchPricesAsync(storeService);

    }


    public static void searchPricesAsync(StoreServiceWithDiscount storeService) {
        List<String> list = List.of("Store 1", "Store 2", "Store 3", "Store 4");
        long start = System.currentTimeMillis();
        var completableFutures = list.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> storeService.getPricesSync(s)))
                .map(cf -> cf.thenApply(Quote::newQuote))
                .map(cf -> cf.thenCompose(quote -> CompletableFuture.supplyAsync(() -> storeService.applyDiscount(quote))))
                .map(cf -> cf.thenAccept(s -> System.out.printf("%s Finished: %d%n", s, (System.currentTimeMillis() - start))))
                .toArray(CompletableFuture[]::new);

      //  CompletableFuture<Void> objectCompletableFuture = CompletableFuture.allOf(completableFutures);
        CompletableFuture<Object> objectCompletableFuture = CompletableFuture.anyOf(completableFutures);
        objectCompletableFuture.join();

        long end = System.currentTimeMillis();

        System.out.printf("Velocidade do metodo Async searchPricesAsync %d%n", (end - start));
    }
}
