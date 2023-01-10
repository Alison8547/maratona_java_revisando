package br.com.maratonajava.datas.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest1 {
    public static void main(String[] args) {
        String pattern = "dd/MM/yyyy HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        System.out.println(simpleDateFormat.format(new Date()));

        try {
            System.out.println(simpleDateFormat.parse("10/01/2023 13:47:20"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
