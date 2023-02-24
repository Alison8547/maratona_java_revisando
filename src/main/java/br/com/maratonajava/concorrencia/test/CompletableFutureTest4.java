package br.com.maratonajava.concorrencia.test;

import br.com.maratonajava.concorrencia.dominio.Quote;
import br.com.maratonajava.concorrencia.service.StoreServiceWithDiscount;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureTest4 {
    public static void main(String[] args) {
        StoreServiceWithDiscount storeService = new StoreServiceWithDiscount();
        searchPricesWithDiscount(storeService);

    }

    public static void searchPricesWithDiscount(StoreServiceWithDiscount storeService) {
        List<String> list = List.of("Store 1", "Store 2", "Store 3", "Store 4");

        //  list.forEach(s -> System.out.println(storeService.getPricesSync(s)));
        long start = System.currentTimeMillis();
        list.stream()
                .map(storeService::getPricesSync)
                .map(Quote::newQuote)
                .map(storeService::applyDiscount)
                .forEach(System.out::println);
        long end = System.currentTimeMillis();

        System.out.printf("Velocidade do metodo sync searchPricesWithDiscount %d%n", (end - start));
    }

    public static void searchPricesWithDiscountAsync(StoreServiceWithDiscount storeService) {
        List<String> list = List.of("Store 1", "Store 2", "Store 3", "Store 4");
        // a terminar
        long start = System.currentTimeMillis();
        list.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> storeService.getPricesSync(s)));

        long end = System.currentTimeMillis();

        System.out.printf("Velocidade do metodo Async searchPricesWithDiscountAsync %d%n", (end - start));
    }
}
