package br.com.maratonajava.poo.modificadorstatic.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    static {
        System.out.println("Dentro do bloco de inicialização estatico 1 ");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicialização estatico 2 ");
    }

    static {
        System.out.println("Dentro do bloco de inicialização estatico 3 ");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estatico");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int list : episodios) {
            System.out.print(list + " ");
        }
        System.out.println();
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


}
