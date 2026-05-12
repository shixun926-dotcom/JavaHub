package com05.Study04Demo.D3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        //可以优化成输入指定生日，不再更改
        System.out.println(Jdk7SurviveDays("2006-01-10"));
        System.out.println(Jdk8SurviveDays(2006,1,10));

    }
    public static long Jdk7SurviveDays(String str) throws ParseException {
        //定义一个初始的时间为我的生日，再定义一个时间为现在的时间，二者相比较时间原点的偏移毫秒值相减
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthday = sdf.parse(str);
        long time1 = birthday.getTime();//获取毫秒值
        Date now = new Date();
        long time2 = now.getTime();
        long time3 = time2 - time1;

        return time3/1000/60/60/24;
    }
    public static long Jdk8SurviveDays(int x,int y,int z) throws ParseException {
        LocalDate now = LocalDate.now();
        LocalDate birthday = LocalDate.of(x,y,z);//输入生日
        return ChronoUnit.DAYS.between(birthday, now);

    }
}
