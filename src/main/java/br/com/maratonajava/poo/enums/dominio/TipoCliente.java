package br.com.maratonajava.poo.enums.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisíca"),
    PESSOA_JURIDICA(2, "Pessoa Juridica"),
    ;

    private int valor;
    private String tipoRelatorio;

    TipoCliente(int valor, String tipoRelatorio) {
        this.valor = valor;
        this.tipoRelatorio = tipoRelatorio;
    }

    public static TipoCliente tipoClientePorRelatorio(String tipoRelatorio) {
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getTipoRelatorio().equals(tipoRelatorio)) {
                return tipoCliente;
            }
        }

        return null;
    }

    public int getValor() {
        return valor;
    }

    public String getTipoRelatorio() {
        return tipoRelatorio;
    }
}
