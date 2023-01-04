package br.com.maratonajava.poo.interfaces.dominio;

public class DatabaseLoader implements DataLoader {
    @Override
    public void load() {
        System.out.println("Buscando dados do banco de dados...");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissão no banco de dados...");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("retrieveMaxDataSize dentro da DatabaseLoader");
    }
}
