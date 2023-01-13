package br.com.maratonajava.nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest1 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/alison");
        Path clazz = Paths.get("/home/alison/devdojo/OlaMundo.java");

        System.out.println(dir.relativize(clazz));

        Path absoluto1 = dir;
        Path absoluto2 = Paths.get("/usr/local");
        Path absoluto3 = Paths.get("temp");
        Path absoluto4 = Paths.get("temp/temp.23234");
        Path absoluto5 = clazz;


        System.out.println("1: " + absoluto1.relativize(absoluto5));
        System.out.println("2: " + absoluto5.relativize(absoluto1));
        System.out.println("3: " + absoluto1.relativize(absoluto2));
        System.out.println("4: " + absoluto4.relativize(absoluto3));
        System.out.println("5: " + absoluto3.relativize(absoluto4));


    }
}
