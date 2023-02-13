package br.com.maratonajava.concorrencia.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Printer implements Runnable {
    private final int num;

    Printer(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.printf("%s Iniciou: %d%n", Thread.currentThread().getName(), num);
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("%s Finalizou %n", Thread.currentThread().getName());
    }
}

public class ExecutorsTest1 {
    public static void main(String[] args) {
        // System.out.println(Runtime.getRuntime().availableProcessors());
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        ExecutorService executorSingle = Executors.newSingleThreadExecutor();
        ExecutorService executorCached = Executors.newCachedThreadPool();
        executorService.execute(new Printer(1));
        executorService.execute(new Printer(2));
        executorService.execute(new Printer(3));
        executorService.execute(new Printer(4));
        executorService.shutdown();
        System.out.println("Programa finalizou!");
    }
}
