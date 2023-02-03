package br.com.maratonajava.threads.test;

import br.com.maratonajava.threads.dominio.Account;

public class ThreadAccountTest1 implements Runnable {
    private final Account account = new Account();

    public static void main(String[] args) {
        ThreadAccountTest1 threadAccountTest1 = new ThreadAccountTest1();
        Thread t1 = new Thread(threadAccountTest1, "Alison");
        Thread t2 = new Thread(threadAccountTest1, "Maria");

        t1.start();
        t2.start();
    }

    private void withdrawl(int amount) {
        System.out.printf("%s fora do synchronized%n", getThreadName());
        synchronized (account) {
            if (account.getBalance() >= amount) {
                System.out.printf("%s está indo sacar o dinheiro%n", getThreadName());
                System.out.printf("%s dentro do synchronized%n", getThreadName());
                account.withdrawl(amount);
                System.out.printf("%s sacou o dinheiro e ficou com %d%n", getThreadName(), account.getBalance());
            }
        }
    }

    private String getThreadName() {
        return Thread.currentThread().getName();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawl(10);
        }
        if (account.getBalance() < 0) {
            System.out.println("Deu errado!");
        }
    }
}
