package br.com.maratonajava.exceptions.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest2 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }

    public static void criarNovoArquivo() throws IOException {
        File file = new File("arquivo\\teste.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.printf("Criou o arquivo ? %s%n", isCreated);

        } catch (IOException e) {
            e.getStackTrace();
            throw e; // Fazendo com o que o proximo que chamar esse metodo faça sua propria tratação de erro.
        }
    }
}
