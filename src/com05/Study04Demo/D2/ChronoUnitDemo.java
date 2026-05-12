package com05.Study04Demo.D2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ChronoUnitDemo {
    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = LocalDate.now().minusYears(10);
        long chronoUnit = ChronoUnit.DAYS.between(localDate2,localDate1);

        System.out.println(chronoUnit);
    }
}
