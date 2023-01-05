package br.com.maratonajava.exceptions.exception.test;

import br.com.maratonajava.exceptions.exception.dominio.Leitor1;
import br.com.maratonajava.exceptions.exception.dominio.Leitor2;

import java.io.IOException;

public class TryWithResourcesTest1 {
    public static void main(String[] args) throws Exception {
        lerArquivo();
    }

    private static void lerArquivo() throws Exception {
        try (Leitor1 leitor1 = new Leitor1();  // pra usar aqui e já fechar, tem que a class ser implementada por Closeable ou AutoCloseable
             Leitor2 leitor2 = new Leitor2()) {

        } catch (IOException e) {

        }
    }
}
