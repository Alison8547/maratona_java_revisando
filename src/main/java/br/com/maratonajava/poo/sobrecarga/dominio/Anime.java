package br.com.maratonajava.poo.sobrecarga.dominio;

public class Anime {
    private int episodios;
    private String tipo;
    private String genero;
    private String nome;

    public void init(String nome, String tipo, String genero) {
        this.nome = nome;
        this.tipo = tipo;
        this.genero = genero;
    }

    public void init(String nome, String tipo, String genero, int episodios) {
        this.init(nome, tipo, genero);
        this.episodios = episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEpisodios() {
        return episodios;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }
}
