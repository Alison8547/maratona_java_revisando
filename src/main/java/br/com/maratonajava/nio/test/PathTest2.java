package br.com.maratonajava.nio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest2 {
    public static void main(String[] args) throws IOException {
        Path pastaPath = Paths.get("pasta");
        if (Files.notExists(pastaPath)) {
            Files.createDirectory(pastaPath);
        }

        Path pathSubpasta = Paths.get("pasta/subpasta/subsubpasta");
        Files.createDirectories(pathSubpasta);

        Path pathFileTxt = Paths.get(pathSubpasta.toString(), "file.txt");

        if (Files.notExists(pathFileTxt)) {
            Files.createFile(pathFileTxt);
        }

        Path source = pathFileTxt;
        Path target = Paths.get(pathFileTxt.getParent().toString(), "file_renomed.txt");

        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
}
