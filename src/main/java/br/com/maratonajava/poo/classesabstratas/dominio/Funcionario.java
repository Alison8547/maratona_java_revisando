package br.com.maratonajava.poo.classesabstratas.dominio;

public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected Double salario;

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    @Override
    public void imprimi() {
        System.out.println("Imprimindo...");
    }

    public abstract void calculaBonus();
}
