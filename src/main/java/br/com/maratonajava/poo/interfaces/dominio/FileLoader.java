package br.com.maratonajava.poo.interfaces.dominio;

public class FileLoader implements DataLoader {
    @Override
    public void load() {
        System.out.println("Lendo dados de um arquivo...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissão no arquivo...");
    }
}
