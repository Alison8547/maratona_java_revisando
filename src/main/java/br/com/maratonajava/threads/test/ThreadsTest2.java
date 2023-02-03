package br.com.maratonajava.threads.test;


class ThreadRunnableExample2 implements Runnable {

    private final String c;

    ThreadRunnableExample2(String c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadsTest2 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadRunnableExample2("KA"));
        Thread t2 = new Thread(new ThreadRunnableExample2("ME"));

        t1.start();
        t1.join();
        t2.start();

    }
}
