package br.com.maratonajava.nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest1 {
    public static void main(String[] args) {
        String diretorio = "home/alison/dev";
        String arquivoTxt = "../../arquivo.txt";

        Path path = Paths.get(diretorio, arquivoTxt);

        System.out.println(path.normalize());
    }
}
