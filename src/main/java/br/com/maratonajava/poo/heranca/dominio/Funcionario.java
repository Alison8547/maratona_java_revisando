package br.com.maratonajava.poo.heranca.dominio;

public class Funcionario extends Pessoa{
    private Double salario;

    public void imprimir() {
        super.imprimir();
        System.out.printf("Salário: R$ %.2f%n",this.salario);
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
