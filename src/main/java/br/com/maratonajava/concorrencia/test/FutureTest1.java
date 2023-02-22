package br.com.maratonajava.concorrencia.test;

import java.util.concurrent.*;

public class FutureTest1 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Double> dolarRequest = executorService.submit(() -> {
            TimeUnit.SECONDS.sleep(15);
            return 4.35d;
        });

        System.out.println(doSomething());
        Double dolarResponse = null;
        try {
            dolarResponse = dolarRequest.get(3, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
        System.out.println(dolarResponse);

    }

    public static long doSomething() {
        System.out.println(Thread.currentThread().getName());
        long sum = 0;
        for (int i = 0; i < 1_000_000; i++) {
            sum += i;
        }
        return sum;
    }
}
