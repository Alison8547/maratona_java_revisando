package br.com.maratonajava.string.test;

public class StringPerformanceTest1 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        stringConcat(30_000);
        long fim = System.currentTimeMillis();

        System.out.printf("Quantidade de tempo stringConcat %d ms%n", (fim - inicio));

        inicio = System.currentTimeMillis();
        stringConcatBuider(1_000_000);
        fim = System.currentTimeMillis();

        System.out.printf("Quantidade de tempo stringConcatBuilder %d ms%n", (fim - inicio));

        inicio = System.currentTimeMillis();
        stringConcatBuffer(1_000_000);
        fim = System.currentTimeMillis();

        System.out.printf("Quantidade de tempo stringConcatBuffer %d ms%n", (fim - inicio));
    }

    private static void stringConcat(Integer tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    private static void stringConcatBuider(Integer tamanho) {
        StringBuilder stringBuilder = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            stringBuilder.append(i);
        }
    }

    private static void stringConcatBuffer(Integer tamanho) {
        StringBuffer stringBuffer = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            stringBuffer.append(i);
        }
    }
}
