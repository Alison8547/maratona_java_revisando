package br.com.maratonajava.datas.test;

import java.util.Date;

public class DateTest1 {
    public static void main(String[] args) {
        Date date = new Date(1_000_000_000);
        Date date2 = new Date(1673291425288L);
        System.out.println(date);

        date2.setTime(date2.getTime() + 3_600_000);

        System.out.println(date2);
    }
}
