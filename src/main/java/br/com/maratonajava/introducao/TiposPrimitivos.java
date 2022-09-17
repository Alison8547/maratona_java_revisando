package br.com.maratonajava.introducao;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // 8 tipos primitivos: byte, int, long, short, float, double, char, boolean
        byte idade = 18;
        int numberHouse = (int) 10000000000L; // cast de um tipo long para int mas vai sair um resultado estranho pq passou do limite
        long numberBig = (long) 857234.45;
        short numberSmall = 54;
        float numberFloat = 43.23f;
        double numberDouble = 100.0d;
        char caractere = '\u0041';
        boolean verdadeiro = true;

        System.out.printf("Idade: %d%n", idade);
        System.out.println(verdadeiro);
        System.out.println(caractere);
        System.out.println(numberDouble);
        System.out.println(numberHouse);
        System.out.println(numberBig);

        String nome = "Sasuke";
        System.out.printf("Meu nome é: %s%n", nome);

    }
}
