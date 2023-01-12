package br.com.maratonajava.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest1 {
    public static void main(String[] args) {
        String regex = "ju";
        String texto = "juliana colocou um apelido agora é juuh";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);


        while (matcher.find()) {
            System.out.print(matcher.start() + " ");
        }
    }
}
