package br.com.maratonajava.exceptions.runtime.test;

public class RuntimeExceptionTest2 {
    public static void main(String[] args) {
        divisao(2, 0);

    }

    /**
     * @param a
     * @param b não pode ser zero
     * @return
     * @throws IllegalArgumentException
     */
    private static int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão não pode ser dividida por zero!");
        }

        return a / b;
    }
}
