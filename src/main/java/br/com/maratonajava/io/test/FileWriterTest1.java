package br.com.maratonajava.io.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest1 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write("\nOlá mundo\nJava");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
