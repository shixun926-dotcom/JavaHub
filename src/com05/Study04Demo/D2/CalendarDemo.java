package com05.Study04Demo.D2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class CalendarDemo {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalTime localDate1 = LocalTime.now();
        System.out.println(localDate1);
        LocalDateTime localDate2 = LocalDateTime.now();
        System.out.println(localDate2);


    }
}
