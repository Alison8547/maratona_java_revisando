package br.com.maratonajava.exceptions.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest1 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    public static void criarNovoArquivo() {
        File file = new File("arquivo\\teste.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.printf("Criou o arquivo ? %s%n", isCreated);

        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
