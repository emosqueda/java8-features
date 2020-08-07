package com.tech;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTimeAPIExamples {

    public static void main(String[] args) {
        /***********   Local Date/Time API   ********************************************/

        // Get the current date and time
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Current date and time: " + localDateTime);

        //Get the current date
        LocalDate currentDate = localDateTime.toLocalDate();
        System.out.println("Current date: " + currentDate);

        //Get current month
        Month currentMonth = localDateTime.getMonth();
        System.out.println("Current month: " + currentMonth);

        //Current day
        int currentDay = localDateTime.getDayOfMonth();
        System.out.println("Current day: " + currentDay);

        //Current year
        int currentYear = localDateTime.getYear();
        System.out.println("Current year: " + currentYear);

        //Get current hour / minute / seconds
        int currentSeconds = localDateTime.getSecond();
        int currentMinutes = localDateTime.getMinute();
        int currentHour = localDateTime.getHour();
        System.out.println("Hour: " + currentHour + " Minute: " + currentMinutes +" Seconds: " + currentSeconds);

        //Get custom date 2020-01-01
        LocalDate customDate = LocalDate.of(2020, Month.JANUARY, 01);
        System.out.println("Custom Date: " + customDate);

        //Get custom time 12:30
        LocalTime customTime = LocalTime.of(12, 30);
        System.out.println("Custom Time: " + customTime);

        //Parse a string containing a random time
        LocalTime parsedTime = LocalTime.parse("10:30:00");
        System.out.println("Parsed String: " + parsedTime);

        /***********   Zoned Date/Time API   ********************************************/

        ZonedDateTime zonedDateTime = ZonedDateTime.parse("2020-07-02T10:30:00+05:00[America/Mexico_City]");
        System.out.println("Zoned date time: " + zonedDateTime);

        //Get the zone id
        ZoneId zoneId = ZoneId.of("America/Mexico_City");
        System.out.println("Zone id: " + zoneId);

        //Get current zone
        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println("Current zone: " + currentZone);

        /***********   Period and Duration Classes   ********************************************/

        //Get the current date
        LocalDate currentDate1 = LocalDate.now();
        System.out.println("Current date: " + currentDate1);

        //Add 6 month to the current date (We can add minutes, hours, seconds, days etc as well)
        LocalDate customDate1 = currentDate1.plus(6, ChronoUnit.MONTHS);
        System.out.println("Custom date: " + customDate1);

        //Get the period between current date and the custom date in which we added 6 months
        Period period = Period.between(customDate1, currentDate1);
        System.out.println("Period: " + period);
    }

}
