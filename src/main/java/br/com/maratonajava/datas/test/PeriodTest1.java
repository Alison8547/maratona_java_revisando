package br.com.maratonajava.datas.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest1 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYear = LocalDate.now().plusYears(2).plusDays(4);

        Period p1 = Period.between(now, nowAfterTwoYear);

        Period p2 = Period.ofDays(10);
        Period p3 = Period.ofMonths(4);
        Period p4 = Period.ofWeeks(58);
        Period p5 = Period.ofYears(3);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);

        System.out.println(now.until(now.plusDays(p4.getDays()), ChronoUnit.MONTHS));
    }
}
