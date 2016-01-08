package com.tester.learn.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by leosong on 16-1-8.
 */
public class Test {

    public static void main(String[] args)
    {
        String strPattern = "[0-2][0-9]:[0-6][0-6]\\s*[a-zA-z]+";
        Pattern pattern = Pattern.compile(strPattern);
        Matcher matcher = pattern.matcher("23:21 GYT");
        boolean isCurrentDayNews = matcher.matches();
        System.out.println(isCurrentDayNews);
    }

}
