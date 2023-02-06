package br.com.maratonajava.threads.dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
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
        synchronized (emails) {
            System.out.printf("%s adicionou email na lista%n", threadName());
            emails.add(email);
            emails.notifyAll();
        }
    }

    public String retrieveEmail() throws InterruptedException {
        System.out.println(threadName() + " checking if there are emails");
        synchronized (emails) {
            while (emails.size() == 0) {
                if (!open) return null;
                System.out.println(threadName() + " Não tem email disponivel na lista! entrando em modo de espera...");
                emails.wait();
            }
        }
        return emails.poll();
    }

    public void close() {
        open = false;
        synchronized (emails) {
            System.out.println(threadName() + " Notificando que não estamos mandando mais emails!");
        }
    }

    public String threadName() {
        return Thread.currentThread().getName();
    }


}
