package br.com.maratonajava.datas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class ProximoDiaUtil implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDay;
        switch (dayOfWeek) {
            case MONDAY, TUESDAY, WEDNESDAY, SUNDAY -> addDay = 1;
            case THURSDAY -> addDay = 4;
            case FRIDAY -> addDay = 3;
            case SATURDAY -> addDay = 2;

            default -> addDay = 0;

        }

        return temporal.plus(addDay, ChronoUnit.DAYS);
    }
}

public class TemporalAdjusterTest1 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().withDayOfMonth(13).with(new ProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().withDayOfMonth(12).with(new ProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().withDayOfMonth(16).with(new ProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().withDayOfMonth(14).with(new ProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().withDayOfMonth(15).with(new ProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());


    }
}
