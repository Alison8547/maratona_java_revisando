package br.com.maratonajava.datas.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest1 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(1998, Month.MAY, 11, 12, 0, 0);
        System.out.println(ChronoUnit.DAYS.between(aniversario, LocalDateTime.now()));
        System.out.println(ChronoUnit.WEEKS.between(aniversario, LocalDateTime.now()));
        System.out.println(ChronoUnit.MONTHS.between(aniversario, LocalDateTime.now()));
        System.out.println(ChronoUnit.YEARS.between(aniversario, LocalDateTime.now()));
    }
}
