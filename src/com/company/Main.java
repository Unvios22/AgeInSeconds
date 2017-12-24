package com.company;

import java.time.*;


public class Main {

    public static void main(String[] args) throws Exception
    {
        long nowInMs = Instant.now().toEpochMilli();
        LocalDate birthday = LocalDate.parse("1998-02-05");
        long birthDayInMs = birthday.atStartOfDay(ZoneId.of("Europe/Warsaw")).toInstant().toEpochMilli();
        long ageInSeconds = (nowInMs - birthDayInMs) /1000;
        System.out.println(ageInSeconds);
    }
}
