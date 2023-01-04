package br.com.maratonajava.poo.interfaces.dominio;

public interface DataLoader {
    void load();

    int MAX_DATA_SIZE = 10;

    default void checkPermission() {
        System.out.println("Checando permissão...");
    }

    static void retrieveMaxDataSize() {
        System.out.println("retrieveMaxDataSize dentro da interface");
    }
}
