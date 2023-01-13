package br.com.maratonajava.nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest1 {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\alison.ailson\\IdeaProjects\\Maratona_Java\\file.txt");
        Path p2 = Paths.get("C:\\Users\\alison.ailson\\IdeaProjects\\Maratona_Java", "file.txt");
        Path p3 = Paths.get("C:", "Users\\alison.ailson\\IdeaProjects\\Maratona_Java\\file.txt");
        Path p4 = Paths.get("C:", "Users", "alison.ailson", "IdeaProjects", "Maratona_Java", "file.txt");
        System.out.println(p1.getFileName());
        System.out.println(p2.getFileName());
        System.out.println(p3.getFileName());
        System.out.println(p4.getFileName());
    }
}
