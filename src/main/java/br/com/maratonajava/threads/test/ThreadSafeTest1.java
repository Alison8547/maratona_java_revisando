package br.com.maratonajava.threads.test;

import java.util.ArrayList;
import java.util.List;

class ThreadSafeName {
    private List<String> names = new ArrayList<>();

    public synchronized void add(String nome) {
        names.add(nome);
    }

    public synchronized void remove() {
        System.out.println(Thread.currentThread().getName());
        if (names.size() > 0) {
            System.out.println(names.remove(0));
        }
    }
}

public class ThreadSafeTest1 {
    public static void main(String[] args) {
        ThreadSafeName threadSafeName = new ThreadSafeName();
        threadSafeName.add("Julio");
        Runnable runnable = threadSafeName::remove;

        new Thread(runnable).start();
        new Thread(runnable).start();
    }
}
