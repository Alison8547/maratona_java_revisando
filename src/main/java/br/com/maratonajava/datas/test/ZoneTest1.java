package br.com.maratonajava.datas.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest1 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneOffset.SHORT_IDS;
        System.out.println(shortIds);

        ZoneId zoneId = ZoneId.of("Europe/Paris");
        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime zonedDateTime = now.atZone(zoneId);
        System.out.println(zonedDateTime);

        System.out.println(ZoneId.systemDefault());

        Instant instantNow = Instant.now();
        ZonedDateTime zonedDateTime1 = instantNow.atZone(zoneId);
        System.out.println(zonedDateTime1);

        System.out.println(ZoneOffset.MAX);
        System.out.println(ZoneOffset.MIN);

        ZoneOffset zoneOffset = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime1 = now.atOffset(zoneOffset);
        System.out.println(offsetDateTime1);
        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(now, zoneOffset);
        System.out.println(offsetDateTime2);
        OffsetDateTime offsetDateTime3 = instantNow.atOffset(zoneOffset);
        System.out.println(offsetDateTime3);

        JapaneseDate japaneseDateNow = JapaneseDate.now();
        System.out.println(japaneseDateNow);

        JapaneseDate japaneseDate = JapaneseDate.of(1970, 1, 1);
        System.out.println(japaneseDate);
    }
}
