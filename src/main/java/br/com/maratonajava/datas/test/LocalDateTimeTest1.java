package br.com.maratonajava.datas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest1 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDate date = LocalDate.parse("2023-01-11");
        LocalTime time = LocalTime.parse("17:48:00");

        LocalDateTime localDateTime1 = date.atTime(time);
        LocalDateTime localDateTime2 = time.atDate(date);

        System.out.println(date);
        System.out.println(time);

        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
    }
}
