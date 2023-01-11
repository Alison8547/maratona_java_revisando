package br.com.maratonajava.datas.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest2 {
    public static void main(String[] args) {
        Locale localeJP = Locale.JAPAN;
        Locale localeKR = Locale.KOREAN;
        Locale localeCA = Locale.CANADA;


        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(localeCA);
        nfa[2] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[3] = NumberFormat.getCurrencyInstance(localeKR);

        double number = 100_000_000_300.43;

        for (NumberFormat listNF : nfa) {
            System.out.println(listNF.format(number));
        }

        String valor = "￥100300.43";

        try {
            System.out.println(nfa[2].parse(valor));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
