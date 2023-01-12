package br.com.maratonajava.regex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest5 {
    public static void main(String[] args) {
        // \d = Todos os dígitos
        // \D = Tudo o que não for dígito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracters excluindo os brancos
        // \w = a-ZA-Z, dígitos, _
        // \W = Tudo o que não for incluso no \w
        // []
        // ? Zero ou uma
        // * zero ou mais
        // + uma ou mais
        // {n,m} de n até m
        // ()
        // |
        // $

        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "alison@hotmail.com, 123digo@gmail.com, luiz@gmail, juliana@gmail.com.br, @!#tiago@hotmail.com";


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Texto:  " + texto);
        System.out.println("Indice: 0123456789");
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }

        System.out.println(texto.split(",")[1].trim());
        System.out.println(Arrays.toString(texto.split(",")));
    }
}
