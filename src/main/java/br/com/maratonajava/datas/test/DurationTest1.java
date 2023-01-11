package br.com.maratonajava.datas.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationTest1 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoDays = LocalDateTime.now().plusDays(2);

        LocalTime timeNow = LocalTime.now();
        LocalTime timeNowAfterEightHours = LocalTime.now().minusHours(8);

        Duration d1 = Duration.between(now, nowAfterTwoDays);
        Duration d2 = Duration.between(timeNow, timeNowAfterEightHours);
        Duration d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
        Duration d4 = Duration.ofDays(20);
        Duration d5 = Duration.ofHours(2);
        Duration d6 = Duration.ofMinutes(3);
        Duration d7 = Duration.of(2, ChronoUnit.DAYS);


        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);
        System.out.println(d7);


    }
}
