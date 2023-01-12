package br.com.maratonajava.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest3 {
    public static void main(String[] args) {
        // \d = Todos os dígitos
        // \D = Tudo o que não for dígito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracters excluindo os brancos
        // \w = a-ZA-Z, dígitos, _
        // \W = Tudo o que não for incluso no \w
//        String regex = "[a-zA-C]";
//        String texto = "cafeBABE";

        String regex = "0[xX][0-9a-fA-F]";
        String texto = "43 0x 0X 0xF234 0x109 0x1";


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Texto:  " + texto);
        System.out.println("Indice: 0123456789");
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}
