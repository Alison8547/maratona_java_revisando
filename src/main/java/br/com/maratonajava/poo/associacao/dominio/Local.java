package br.com.maratonajava.poo.associacao.dominio;

public class Local {
    private String endereco;

    public Local(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Local{" +
                "endereco='" + endereco + '\'' +
                '}';
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
