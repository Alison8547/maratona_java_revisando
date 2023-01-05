package br.com.maratonajava.exceptions.runtime.test;

public class RuntimeExceptionTest3 {
    public static void main(String[] args) {
        abreConexao();
        abreConexao2();
    }

    public static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo..");
            System.out.println("Escrevendo dados no arquivos");
            return "Conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pela SO");
        }

        return null;
    }

    public static void abreConexao2() {
        try {
            System.out.println("Abrindo arquivo..");
            System.out.println("Escrevendo dados no arquivos");
            throw new RuntimeException();

        } finally {
            System.out.println("Fechando recurso liberado pela SO");
        }

    }
}
