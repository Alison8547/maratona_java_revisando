package br.com.maratonajava.exceptions.error.test;

public class StackOverFlowError {
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade() {
        recursividade();
    }
}
