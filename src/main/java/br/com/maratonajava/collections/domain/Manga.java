package br.com.maratonajava.collections.domain;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String nome;
    private Double preco;
    private Integer quantidade;

    public Manga(Long id, String nome, Double preco) {
        Objects.requireNonNull(id);
        Objects.requireNonNull(nome);
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Manga(Long id, String nome, Double preco, Integer quantidade) {
        this(id, nome, preco);
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Manga o) {
//        if (this.id < o.getId()) {
//            return -1;
//        } else if (this.id.equals(o.getId())) {
//            return 0;
//        } else {
//            return 1;
//        }
        //   return this.nome.compareTo(o.getNome());
        return Double.compare(this.preco, o.getPreco());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(id, manga.id) && Objects.equals(nome, manga.nome) && Objects.equals(preco, manga.preco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

}
