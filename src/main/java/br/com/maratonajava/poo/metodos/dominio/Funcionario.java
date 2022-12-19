package br.com.maratonajava.poo.metodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;

    public Funcionario(String nome, int idade, double[] salarios) {
        this.nome = nome;
        this.idade = idade;
        this.salarios = salarios;
    }

    public Funcionario() {
    }

    public void imprimir() {
        System.out.printf("Seu nome: %s%nIdade: %d%n", nome, idade);
        for (double list : salarios) {
            System.out.printf("Seus salarios: %.2f%n", list);
        }
    }

    public void mediaSalario() {
        double media = 0;
        for (double list : salarios) {
            media += list;
        }

        System.out.printf("Média do seus salários: %.2f%n", media / salarios.length);
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public double[] getSalarios() {
        return salarios;
    }
}
