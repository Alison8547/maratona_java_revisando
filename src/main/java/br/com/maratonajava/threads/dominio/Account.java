package br.com.maratonajava.threads.dominio;

public class Account {
    private int balance = 50;

    public int getBalance() {
        return balance;
    }

    public void withdrawl(int amount) {
        this.balance = this.balance - amount;
    }


}
