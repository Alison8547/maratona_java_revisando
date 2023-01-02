package br.com.maratonajava.poo.metodos.dominio;

public class Carro {
    private String name;
    private String modelo;
    private int ano;

    public Carro(String name, String modelo, int ano) {
        this.name = name;
        this.modelo = modelo;
        this.ano = ano;
    }

    public Carro() {
    }

    @Override
    public String toString() {
        return "Carro{" +
                "name: '" + name + '\'' +
                ", modelo: '" + modelo + '\'' +
                ", ano: " + ano +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
