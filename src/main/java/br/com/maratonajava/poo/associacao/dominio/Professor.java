package br.com.maratonajava.poo.associacao.dominio;

import java.util.Arrays;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", especialidade='" + especialidade + '\'' +
                '}';
    }

    public void imprimir() {
        System.out.printf("Nome: %s | Especialidade: %s%n", nome, especialidade);
        for (Seminario seminario : seminarios) {
            System.out.printf("Titulo seminario: %s | local: %s | alunos: %s%n", seminario.getTitulo(),
                    seminario.getLocal().getEndereco(), Arrays.toString(seminario.getAlunos()));

        }

    }

    public Professor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
