package br.com.maratonajava.threads.test;

class ThreadExample extends Thread {
    private final char c;

    ThreadExample(char c) {
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
    }
}

class ThreadRunnableExample implements Runnable {

    private final char c;

    ThreadRunnableExample(char c) {
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
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadsTest1 {
    public static void main(String[] args) {
//        ThreadExample t1 = new ThreadExample('A');
//        ThreadExample t2 = new ThreadExample('B');
//        ThreadExample t3 = new ThreadExample('C');
//        ThreadExample t4 = new ThreadExample('D');

        Thread t1 = new Thread(new ThreadRunnableExample('A'), "T1A");
        Thread t2 = new Thread(new ThreadRunnableExample('B'), "T2B");
        Thread t3 = new Thread(new ThreadRunnableExample('C'), "T3C");
        Thread t4 = new Thread(new ThreadRunnableExample('D'), "T4D");

        t4.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        System.out.println("#########################" + Thread.currentThread().getName());

    }
}
