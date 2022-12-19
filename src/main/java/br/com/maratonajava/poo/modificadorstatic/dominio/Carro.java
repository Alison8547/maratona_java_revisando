package br.com.maratonajava.poo.modificadorstatic.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 200; // static que dizer q o atributo pertence a class

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime() {
        System.out.println("Nome: " + nome);
        System.out.printf("Velocidade Maxima: %.1f%n", velocidadeMaxima);
        System.out.printf("Velocidade Limite: %.1f%n", Carro.velocidadeLimite);
    }

    public Carro() {
    }

    public static void setVelocidadeLimite(double velocidadeLimite) { // é recomendando usar um método static quando ela não faz refêrencia a nenhum objeto de instância
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite() {
        return Carro.velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
