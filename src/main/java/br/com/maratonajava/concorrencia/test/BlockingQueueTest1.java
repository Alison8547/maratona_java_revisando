package br.com.maratonajava.concorrencia.test;

import java.util.concurrent.ArrayBlockingQueue;

class RemovedBlockingQueue implements Runnable {
    private final ArrayBlockingQueue<String> bq;

    RemovedBlockingQueue(ArrayBlockingQueue<String> bq) {
        this.bq = bq;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.printf("%s removendo valor da fila: %s%n", Thread.currentThread().getName(), bq.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class BlockingQueueTest1 {
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
        bq.put("Alison");
        System.out.printf("%s adicinou o valor: %s%n", Thread.currentThread().getName(), bq.peek());
        System.out.println("Tentando adicionar outro valor..");
        new Thread(new RemovedBlockingQueue(bq)).start();
        bq.put("Jonas");
        System.out.printf("%s adicinou o valor: %s%n", Thread.currentThread().getName(), bq.peek());

    }
}
