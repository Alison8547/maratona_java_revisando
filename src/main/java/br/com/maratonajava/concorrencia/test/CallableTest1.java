package br.com.maratonajava.concorrencia.test;

import java.util.concurrent.*;

class RandomNumberCalleble implements Callable<String> {

    @Override
    public String call() throws Exception {
        int num = ThreadLocalRandom.current().nextInt(1, 12);
        for (int i = 0; i < num; i++) {
            System.out.printf("%s executou uma tarefa callable..%n", Thread.currentThread().getName());
        }

        return String.format("%s finished and number random %d%n", Thread.currentThread().getName(), num);
    }
}

public class CallableTest1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        RandomNumberCalleble randomNumberCalleble = new RandomNumberCalleble();
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<String> future = executor.submit(randomNumberCalleble);
        executor.shutdown();
        System.out.printf("Programa finished result: %s%n", future.get());

    }
}
