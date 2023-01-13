package br.com.maratonajava.nio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest1 {
    public static void main(String[] args) {
        // Output: mandando alguma coisa
        // Input: lendo alguma coisa
        Path arquivoZip = Paths.get("pasta/arquivo.zip");
        Path arquivosParaZipar = Paths.get("pasta/subpasta/subsubpasta");

        zip(arquivoZip, arquivosParaZipar);
    }

    private static void zip(Path arquivoZip, Path arquivosParaZipar) {
        try (ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(arquivoZip));
             DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivosParaZipar)) {
            for (Path path : directoryStream) {
                ZipEntry zipEntry = new ZipEntry(path.getFileName().toString());
                zipStream.putNextEntry(zipEntry);
                Files.copy(path, zipStream);
                zipStream.closeEntry();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
