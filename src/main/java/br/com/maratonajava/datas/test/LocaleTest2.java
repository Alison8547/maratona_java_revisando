package br.com.maratonajava.datas.test;

import java.util.Locale;

public class LocaleTest2 {
    public static void main(String[] args) {
        String[] isoLanguages = Locale.getISOLanguages();
        String[] isoCountries = Locale.getISOCountries();


        for (String listLanguages : isoLanguages) {
            System.out.print(listLanguages + " ");
        }

        System.out.println();

        for (String listCountries : isoCountries) {
            System.out.print(listCountries + " ");
        }




    }
}
