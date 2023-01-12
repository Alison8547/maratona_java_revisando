package br.com.maratonajava.io.test;

import java.io.File;
import java.io.IOException;

public class FileTest2 {
    public static void main(String[] args) throws IOException {
        File file = new File("pasta");
        boolean isMkdir = file.mkdir();
        System.out.println("Pasta criada: " + isMkdir);

        File arquivoDiretorio = new File(file, "arquivo.txt");
        boolean newFile = arquivoDiretorio.createNewFile();
        System.out.println("Arquivo diretorio criado: " + newFile);


        File arquivoDiretorioRenomeado = new File(file, "arquivo_renomeado.txt");
        boolean renameArquivo = arquivoDiretorio.renameTo(arquivoDiretorioRenomeado);
        System.out.println("Nome do arquivo renomeado: " + renameArquivo);

        File diretorioRenamed = new File("pasta2");
        boolean renameDiretorio = file.renameTo(diretorioRenamed);
        System.out.println("Nome do diretorio renomeado: " + renameDiretorio);


    }
}
