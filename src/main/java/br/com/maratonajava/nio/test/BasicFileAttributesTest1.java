package br.com.maratonajava.nio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest1 {
    public static void main(String[] args) throws IOException {
        LocalDateTime date = LocalDateTime.now().minusDays(5);

        File file = new File("pasta2/novo_arquivo.txt");

        boolean isCreated = file.createNewFile();
        System.out.println("Criado: " + isCreated);

        boolean isModified = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());
        System.out.println("Modificado: " + isModified);


        Path path = Paths.get("pasta2/novo_path_arquivo.txt");
        Files.createFile(path);
        FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path, fileTime);

        System.out.println(Files.isReadable(path));
        System.out.println(Files.isWritable(path));
        System.out.println(Files.isExecutable(path));

    }
}
