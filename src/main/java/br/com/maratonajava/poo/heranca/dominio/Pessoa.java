package br.com.maratonajava.poo.heranca.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("Dentro do metodo inicialização static Pessoa");
    }

    {
        System.out.println("Dentro do metodo inicializao 1 Pessoa");
    }

    {
        System.out.println("Dentro do metodo inicializao 2 Pessoa");
    }

    public Pessoa(String nome) {
        System.out.println("Dentro do bloco construtor Pessoa");
        this.nome = nome;
    }

    public void imprimir() {
        System.out.printf("Nome: %s%nCpf: %s%nEndereco -> Rua: %s | Cep: %s%n", this.nome, this.cpf, this.endereco.getRua(), this.endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
