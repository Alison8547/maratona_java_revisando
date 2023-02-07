package br.com.maratonajava.concorrencia.dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private boolean open = true;

    public boolean isOpen() {
        return open;
    }

    public int pendingEmail() {
        synchronized (emails) {
            return emails.size();
        }
    }

    public void addMemberEmail(String email) {
        lock.lock();
        try {
            System.out.printf("%s adicionou email na lista%n", threadName());

            emails.add(email);
            condition.signalAll();
        } finally {
            lock.unlock();
        }

    }

    public String retrieveEmail() throws InterruptedException {
        System.out.println(threadName() + " checking if there are emails");
        lock.lock();
        try {
            while (emails.size() == 0) {
                if (!open) return null;
                System.out.println(threadName() + " Não tem email disponivel na lista! entrando em modo de espera...");
                condition.await();
            }
        } finally {
            lock.unlock();
        }
        return emails.poll();
    }

    public void close() {
        open = false;
        lock.lock();
        try {
            System.out.println(threadName() + " Notificando que não estamos mandando mais emails!");
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public String threadName() {
        return Thread.currentThread().getName();
    }


}
