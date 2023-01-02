package br.com.maratonajava.poo.heranca.dominio;

public class Funcionario extends Pessoa {
    private Double salario;

    static {
        System.out.println("Dentro do metodo inicialização static Funcionario");
    }

    {
        System.out.println("Dentro do metodo inicializao 1 Funcionario");
    }

    {
        System.out.println("Dentro do metodo inicializao 2 Funcionario");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor Funcionario");
    }

    public void imprimir() {
        super.imprimir();
        System.out.printf("Salário: R$ %.2f%n", this.salario);
    }

    public void relatorio() {
        System.out.printf("%s recebeu: R$ %.2f%n", this.nome, this.salario);
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
