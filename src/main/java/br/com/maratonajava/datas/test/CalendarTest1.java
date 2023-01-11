package br.com.maratonajava.datas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest1 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);

        if (c.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Primeiro dia da semana é domingo!");
        }
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        c.add(Calendar.DAY_OF_MONTH, 1);
        c.roll(Calendar.HOUR_OF_DAY, 12);

        Date date = c.getTime();
        System.out.println(date);


    }
}
