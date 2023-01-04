package br.com.maratonajava.poo.interfaces.test;

import br.com.maratonajava.poo.interfaces.dominio.DataLoader;
import br.com.maratonajava.poo.interfaces.dominio.DatabaseLoader;
import br.com.maratonajava.poo.interfaces.dominio.FileLoader;

public class DataLoaderTest {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();

        System.out.println(DataLoader.MAX_DATA_SIZE);
    }
}
