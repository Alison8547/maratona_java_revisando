package br.com.maratonajava.io.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest1 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try (FileReader fr = new FileReader(file)) {
//            char[] buf = new char[52];
//            fr.read(buf);
//
//            for (char c : buf) {
//                System.out.print(c);
//            }
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
