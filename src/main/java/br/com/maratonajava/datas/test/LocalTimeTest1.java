package br.com.maratonajava.datas.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest1 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(23, 10, 2);
        System.out.println(localTime);
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());
        System.out.println(localTime.getLong(ChronoField.CLOCK_HOUR_OF_AMPM));

        LocalTime timeNow = LocalTime.now();
        System.out.println(timeNow);

        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);


    }
}
