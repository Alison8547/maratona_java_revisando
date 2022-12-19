package br.com.maratonajava.poo.metodos.dominio;

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

    public void imprime() {
        System.out.println(this.name); // this -> tô fazendo uma referência ao atributo da class
        System.out.println(this.idade);
        System.out.println(this.sexo);
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
