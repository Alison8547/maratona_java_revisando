package br.com.maratonajava.poo.construtores.dominio;

public class Anime {
    private int episodios;
    private String tipo;
    private String genero;
    private String nome;
    private String estudio;

    public Anime(int episodios, String tipo, String genero, String nome) {
        this();
        this.episodios = episodios;
        this.tipo = tipo;
        this.genero = genero;
        this.nome = nome;
    }

    public Anime(int episodios, String tipo, String genero, String nome,String estudio) {
        this(episodios,tipo,genero,nome);
        this.estudio = estudio;
    }

    public Anime() {
        System.out.println("Dentro do construtor vazio!");
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
