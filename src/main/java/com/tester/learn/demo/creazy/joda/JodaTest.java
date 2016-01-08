package com.tester.learn.demo.creazy.joda;
import java.util.Calendar;


/**
 * Created by leosong on 16-1-7.
 */
public class JodaTest {

    public static void main(String[] args)
    {
//        System.out.println("OK");
//        DateTime dt = new DateTime();
//        System.out.println(dt);
//        System.out.println(dt.getDayOfWeek());
//        DateTime dtBRT = dt.withZone(DateTimeZone.forID("America/Araguaina"));
//        DateTime dtGYT = dt.withZone(DateTimeZone.forID("America/Guyana"));
//        DateTime dtCET = dt.withZone(DateTimeZone.forID("Arctic/Longyearbyen"));
//        System.out.println(dtBRT);
//        System.out.println(dtGYT);
//        System.out.println(dtCET);
//
//        Calendar cal = Calendar.getInstance();
//        cal.setTimeInMillis(System.currentTimeMillis());
//        int weekday = cal.get(Calendar.DAY_OF_WEEK);
//        System.out.println(weekday);
        Calendar now = Calendar.getInstance();
        System.out.println(now.getFirstDayOfWeek());
        System.out.println(Calendar.SUNDAY);
        boolean isFirstDaySunday = (now.getFirstDayOfWeek() == Calendar.SUNDAY);
        int weekDay = now.get(Calendar.DAY_OF_WEEK);
        if (isFirstDaySunday)
        {
            weekDay = weekDay - 1;
            if(weekDay == 0){weekDay = 7;}
        }

//
        System.out.println(weekDay);

    }
}
