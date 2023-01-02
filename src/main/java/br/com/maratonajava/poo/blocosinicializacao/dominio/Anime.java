package br.com.maratonajava.poo.blocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    {
        System.out.println("Dentro do bloco de inicialização ");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
            System.out.print(episodios[i]+" ");
        }
        System.out.println();

    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int list : episodios) {
            System.out.print(list + " ");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
}
