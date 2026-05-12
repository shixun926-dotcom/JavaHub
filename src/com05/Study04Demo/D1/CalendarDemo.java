package com05.Study04Demo.D1;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
    public  static void main(String[] args) {



        Calendar cal = Calendar.getInstance();
        Date date = new Date(1000L);
        cal.setTime(date);
        System.out.println(cal);
    }
}
