package br.com.maratonajava.nio.test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTest1 {
    public static void main(String[] args) {
        Path path1 = Paths.get("pasta/subpasta/subsubpasta/arquivo.txt");
        Path path2 = Paths.get("pasta/subpasta/subsubpasta/Arquivo.java");
        Path path3 = Paths.get("pasta/subpasta/subsubpasta/arquivo.bkp");

        matches(path1, "glob:**/*.txt");
        matches(path1, "glob:**/*.java");
        matches(path2, "glob:**/*.java");
        matches(path2, "glob:**/*.{java,txt}");
        matches(path3, "glob:**/*.{java,txt}");
        matches(path3, "glob:**/*.{java,txt,bkp}");
        matches(path2, "glob:**/*.???");
        matches(path2, "glob:**/*.????");
        matches(path2, "glob:**/arquivo.????");
    }

    private static void matches(Path path, String glob) {
        PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher(glob);

        System.out.println(glob + " : " + pathMatcher.matches(path));
    }
}
