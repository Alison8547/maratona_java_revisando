package br.com.maratonajava.datas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest1 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        String s1 = localDate.format(DateTimeFormatter.ISO_DATE);
        String s2 = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s3 = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse1 = LocalDate.parse("2023-01-11", DateTimeFormatter.ISO_DATE);
        LocalDate parse2 = LocalDate.parse("20230111", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2023-01-11", DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime localDateTime = LocalDateTime.now();
        String s4 = localDateTime.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);

        LocalDateTime parse4 = LocalDateTime.parse("2023-01-11T14:07:20.7639371", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse4);

        DateTimeFormatter dateTimeFormatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(dateTimeFormatterBR);
        System.out.println(formatBR);

        LocalDate parseBR = LocalDate.parse("11/01/2023", dateTimeFormatterBR);
        System.out.println(parseBR);

    }
}
