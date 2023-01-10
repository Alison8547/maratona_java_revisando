package br.com.maratonajava.datas.test;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest1 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());

        System.out.println(Month.MAY.getValue());
        LocalDate localDate = LocalDate.of(2023, Month.MAY, 11);
        System.out.println(localDate);
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.lengthOfMonth());
        System.out.println(localDate.isLeapYear());

        LocalDate agora = LocalDate.now();
        agora = agora.plusDays(6); // Imutavel
        System.out.println(agora);


    }
}
