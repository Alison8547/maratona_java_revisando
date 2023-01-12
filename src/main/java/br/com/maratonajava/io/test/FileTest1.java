package br.com.maratonajava.io.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest1 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Criado ? " + isCreated);

            System.out.println("is file: " + file.isFile());
            System.out.println("is directory: " + file.isDirectory());
            System.out.println("is hidden: " + file.isHidden());
            System.out.println("path: " + file.getPath());
            System.out.println("absolute path: " + file.getAbsolutePath());
            System.out.println("Last modified: " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));

            if (file.exists()) {
                boolean isDeleted = file.delete();
                System.out.println("Deletado ? " + isDeleted);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
