package br.com.maratonajava.poo.domain;

public class Estudante {
    private String name;
    private int idade;
    private char sexo;


    public Estudante(String name, int idade, char sexo) {
        this.name = name;
        this.idade = idade;
        this.sexo = sexo;
    }

    public Estudante() {
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "name: '" + name + '\'' +
                ", idade: " + idade +
                ", sexo: " + sexo +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
